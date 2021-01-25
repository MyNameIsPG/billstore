<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">商品规格</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="规格名称" prop="goodsSpeName"><u-input placeholder="请输入规格名称" v-model="model.goodsSpeName" type="text"></u-input></u-form-item>
				<u-form-item label="规格描述" prop="goodsSpeDes"><u-input placeholder="请输入规格描述" v-model="model.goodsSpeDes" type="text"></u-input></u-form-item>
				<u-form-item label="序号" prop="order"><u-input placeholder="请输入序号" v-model="model.order" type="number"></u-input></u-form-item>
				<u-form-item label-position="left" label-width="0" prop="likeFruit">
					<u-checkbox-group>
						<u-checkbox v-model="model.isSale" name="可销售">可销售</u-checkbox>
						<u-checkbox v-model="model.isPrice" name="item.name">可定价</u-checkbox>
						<u-checkbox v-model="model.isBack" name="item.name">可退货</u-checkbox>
						<u-checkbox v-model="model.isPurchase" name="item.name">可进货</u-checkbox>
					</u-checkbox-group>
				</u-form-item>
				<view style="padding: 10px 0px; box-sizing: border-box;"><u-button type="primary" @click="submit">提交</u-button></view>
			</u-form>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		let that = this;
		return {
			uid: "",
			errorType: ['toast'],
			model: {
				goodsId: '',
				goodsName: '',
				goodsSpeName: '',
				goodsSpeDes: "",
				order: 0,
				isSale: true,
				isPrice: true,
				isBack: true,
				isPurchase: true
			},
			goodsId: "",
			goodsName: "",
			radioCheckWrap: false,
			rules: {
				goodsSpeName: [
					{
						required: true,
						message: '请输入规格名称',
						trigger: 'blur'
					}
				]
			}
		};
	},
	onLoad(option) {
		this.goodsName = option.goodsName;
		this.goodsId = option.goodsId;
		this.uid = option.id;
		this.model.goodsId = option.goodsId;
		this.model.goodsName = option.goodsName;
		if(option.id){
			this.getDataInfo();
		}
	},
	onReady() {
		this.$refs.uForm.setRules(this.rules);
	},
	methods: {
		async getDataInfo() {
			const res = await this.request.apiGoodsSpeidGet(this.uid);
			if(res.errCode===0){
				this.model = res.data
			}
		},
		submit() {
			this.$refs.uForm.validate(async valid => {
				if (valid) {
					if(!this.uid){
						const res = await this.request.apiGoodsSpePost(this.model);
						if(res.errCode===0){
							uni.showToast({
								title: "新增成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/goodsNorms/goodsNorms?goodsId=${this.goodsId}&goodsName=${this.goodsName}`
								});
							})
						} else{
							uni.showToast({
								title: "新增失败"
							})
						}
					} else {
						const res = await this.request.apiGoodsSpePut(this.model);
						if(res.errCode===0){
							uni.showToast({
								title: "修改成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/goodsNorms/goodsNorms?goodsId=${this.goodsId}&goodsName=${this.goodsName}`
								});
							})
						} else{
							uni.showToast({
								title: "修改失败"
							})
						}
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
