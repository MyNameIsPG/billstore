<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">新增入库</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="商品规格" prop="goodsId">
					<u-input :select-open="actionSheetShow" @click="actionSheetShow = true" placeholder="请输入商品规格" v-model="model.goodsId" type="select"></u-input>
				</u-form-item>
				<u-form-item label="商品价格" prop="price"><u-input placeholder="请输入商品价格" v-model="model.price" type="number"></u-input></u-form-item>
				<u-form-item label="商品数量" prop="count"><u-input placeholder="请输入商品数量" v-model="model.count" type="number"></u-input></u-form-item>
				<u-form-item label="商品总价" prop="amount"><u-input placeholder="请输入商品总价" v-model="getAmount" type="number" disabled="disabled"></u-input></u-form-item>
				<view style="padding: 10px 0px; box-sizing: border-box;"><u-button type="primary" @click="submit">提交</u-button></view>
				<u-action-sheet :list="actionSheetList" v-model="actionSheetShow" @click="actionSheetCallback"></u-action-sheet>
			</u-form>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		let that = this;
		return {
			uid: '',
			errorType: ['toast'],
			model: {
				goodsId: '',
				goodsName: '',
				goodsSpeId: '',
				goodsSpeName: '',
				price: 0,
				count: 1,
				amount: 0
			},
			rules: {
				goodsId: [
					{
						required: true,
						message: '请选择商品',
						trigger: 'blur'
					}
				]
			},
			actionSheetList: [],
			actionSheetShow: false
		};
	},
	computed: {
		getAmount() {
			return this.model.price * this.model.count
		}
	},
	onLoad(option) {
		this.uid = option.id;
		this.getApiGoodsSpeGet();
	},
	onReady() {
		this.$refs.uForm.setRules(this.rules);
	},
	methods: {
		async getApiGoodsSpeGet() {
			const res = await this.request.apiGoodsSpeGet({
				pageIdx: 1,
				pageSize: 100
			});
			if (res.errCode === 0) {
				this.actionSheetList = res.count;
			}
		},
		actionSheetCallback(index) {
			uni.hideKeyboard();
			this.model.goodsId = this.actionSheetList[index].goodsId;
			this.model.goodsName = this.actionSheetList[index].goodsName;
			this.model.goodsSpeId = this.actionSheetList[index].goodsSpeId;
			this.model.goodsSpeName = this.actionSheetList[index].goodsSpeName;
		},
		submit() {
			this.$refs.uForm.validate(async valid => {
				if (valid) {
					this.model.amount = this.model.price * this.model.count
					const res = await this.request.apiWarehousingPost(this.model);
					if(res.errCode===0){
						uni.showToast({
							title: "新增成功"
						})
						setTimeout(()=>{
							uni.navigateTo({
								url: `/pages/stock/stockWarehousing/stockWarehousing`
							});
						})
					} else{
						uni.showToast({
							title: "新增失败"
						})
					}
				} else {
					console.log('验证失败');
				}
			});
		}
	}
};
</script>

<style scoped lang="scss">
.wrap {
	background: #fff;
}
.agreement {
	display: flex;
	align-items: center;
	margin: 40rpx 0;

	.agreement-text {
		padding-left: 8rpx;
		color: #ccc;
	}
}
</style>
