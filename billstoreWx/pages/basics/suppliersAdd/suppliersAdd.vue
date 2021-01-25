<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">供应商</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="姓名" prop="userName"><u-input placeholder="请输入姓名" v-model="model.userName" type="text"></u-input></u-form-item>
				<u-form-item label="手机号码" prop="phone"><u-input placeholder="请输入手机号" v-model="model.phone" type="number"></u-input></u-form-item>
				<u-form-item label="身份证号" prop="idCard"><u-input placeholder="请输入身份证号" v-model="model.idCard" type="idcard"></u-input></u-form-item>
				<u-form-item label="银行卡号" prop="bankId"><u-input placeholder="请输入银行卡号" v-model="model.bankId" type="number"></u-input></u-form-item>
				<u-form-item label="开户行" prop="bankName"><u-input placeholder="请输入开户行" v-model="model.bankName" type="idcard"></u-input></u-form-item>
				<u-form-item label="开户行地址" prop="bankAdress"><u-input placeholder="请输入开户行地址" v-model="model.bankAdress" type="idcard"></u-input></u-form-item>
				<u-form-item label="地址" prop="idAdress">
					<u-input type="textarea"  placeholder="请输入地址" v-model="model.idAdress" />
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
				userName: '',
				phone: '',
				idCard: '',
				bankId: "",
				bankName: "",
				bankAdress: "",
				idAdress: ""
			},
			rules: {
				userName: [
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
				idCard: [
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
		this.uid = option.id;
		if(option.id){
			this.getDataInfo();
		}
	},
	onReady() {
		this.$refs.uForm.setRules(this.rules);
	},
	methods: {
		async getDataInfo() {
			const res = await this.request.apiSupplierInfoidGet(this.uid);
			if(res.errCode===0){
				this.model = res.data
			}
		},
		submit() {
			this.$refs.uForm.validate(async valid => {
				if (valid) {
					if(!this.uid){
						const res = await this.request.apiSupplierInfoPost(this.model);
						if(res.errCode===0){
							uni.showToast({
								title: "新增成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/suppliers/suppliers`
								});
							})
						} else{
							uni.showToast({
								title: "新增失败"
							})
						}
					} else {
						const res = await this.request.apiSupplierInfoPut(this.model);
						if(res.errCode===0){
							uni.showToast({
								title: "修改成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/suppliers/suppliers`
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
