<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">商品规格</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="规格名称" prop="goodsSpecsName"><u-input placeholder="请输入规格名称" v-model="model.goodsSpecsName" type="text"></u-input></u-form-item>
				<u-form-item label="规格描述" prop="goodsSpecsDesc"><u-input placeholder="请输入规格描述" v-model="model.goodsSpecsDesc" type="text"></u-input></u-form-item>
				<u-form-item label="序号" prop="goodsSpecsSort"><u-input placeholder="请输入序号" v-model="model.goodsSpecsSort" type="number"></u-input></u-form-item>
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
				goodsSpecsName: '',
				goodsSpecsDesc: "",
				goodsSpecsSort: 0,
				isSale: true,
				isPrice: true,
				isBack: true,
				isPurchase: true
			},
			goodsId: "",
			goodsName: "",
			radioCheckWrap: false,
			rules: {
				name: [
					{
						required: true,
						message: '请输入姓名',
						trigger: 'blur'
					}
				],
				phone: [
					{
						required: true,
						message: '请输入手机号',
						trigger: ['change', 'blur']
					},
					{
						validator: (rule, value, callback) => {
							return this.$u.test.mobile(value);
						},
						message: '手机号码不正确',
						trigger: ['change', 'blur']
					}
				],
				idcard: [
					{
						required: true,
						message: '请输入身份证号码',
						trigger: ['change', 'blur']
					},
					{
						validator: (rule, value, callback) => {
							return this.$u.test.idCard(value);
						},
						message: '身份证号码不正确',
						trigger: ['change', 'blur']
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
			const res = await this.request.apiGoodsSpecsInfo(this.uid);
			if(res.ErrCode===0){
				this.model = res.Data
			}
		},
		submit() {
			this.$refs.uForm.validate(async valid => {
				if (valid) {
					if(!this.uid){
						const res = await this.request.apiGoodsSpecsAdd(this.model);
						if(res.ErrCode===0){
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
						const res = await this.request.apiGoodsSpecsUpdate(this.model);
						if(res.ErrCode===0){
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
