<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">商品</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="名称" prop="goodsName"><u-input placeholder="请输入名称" v-model="model.goodsName" type="text"></u-input></u-form-item>
				<u-form-item label="序号" prop="goodsSort"><u-input placeholder="请输入序号" v-model="model.goodsSort" type="number"></u-input></u-form-item>
				<u-form-item label-position="left" label="图片" prop="goodsPic" label-width="150">
					<u-upload width="160" height="160" :max-count="1" @on-list-change="onListChange" :file-list="fileList"></u-upload>
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
			fileList: [],
			model: {
				goodsName: '',
				goodsSort: '',
				goodsPic: ''
			},
			rules: {
				goodsName: [
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
		this.uid = option.id;
		if(option.id){
			this.getDataInfo();
		}
	},
	onReady() {
		this.$refs.uForm.setRules(this.rules);
	},
	methods: {
		onListChange(data, index) {
			console.log(data[0].url)
			this.model.goodsPic = data[0].url
		},
		async getDataInfo() {
			const res = await this.request.apiGoodsInfo(this.uid);
			if(res.ErrCode===0){
				this.model = res.Data
			}
		},
		submit() {
			this.$refs.uForm.validate(async valid => {
				if (valid) {
					if(!this.uid){
						const res = await this.request.apiGoodsAdd(this.model);
						if(res.ErrCode===0){
							uni.showToast({
								title: "新增成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/goods/goods`
								});
							})
						} else{
							uni.showToast({
								title: "新增失败"
							})
						}
					} else {
						const res = await this.request.apiGoodsUpdate(this.model);
						if(res.ErrCode===0){
							uni.showToast({
								title: "修改成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/goods/goods`
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
