<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">支出类别</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="名称" prop="expName"><u-input placeholder="请输入名称" v-model="model.expName" type="text"></u-input></u-form-item>
				<u-form-item label="排序" prop="order"><u-input placeholder="请输入数字" v-model="model.order" type="number"></u-input></u-form-item>
				<u-form-item label-position="left" label="完成付款" prop="isFinished" label-width="150">
					<u-switch v-model="model.isFinished" slot="right"></u-switch>
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
			errorType: ['toast'],
			model: {
				expName: '',
				order: 0,
				isFinished: false
			},
			rules: {
				expName: [
					{
						required: true,
						message: '请输入名称',
						trigger: 'blur'
					}
				],
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
			const res = await this.request.apiExpenditureTypeidGet(this.uid);
			if(res.errCode===0){
				this.model = res.data
			}
		},
		submit() {
			this.$refs.uForm.validate(async valid => {
				if (valid) {
					if(!this.uid){
						const res = await this.request.apiExpenditureTypePost(this.model);
						if(res.errCode===0){
							uni.showToast({
								title: "新增成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/expendType/expendType`
								});
							})
						} else{
							uni.showToast({
								title: "新增失败"
							})
						}
					} else {
						const res = await this.request.apiExpenditureTypePut(this.model);
						if(res.errCode===0){
							uni.showToast({
								title: "修改成功"
							})
							setTimeout(()=>{
								uni.navigateTo({
									url: `/pages/basics/expendType/expendType`
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
