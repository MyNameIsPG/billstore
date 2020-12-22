<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">支付类别</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="名称" prop="name"><u-input placeholder="请输入名称" v-model="model.name" type="text"></u-input></u-form-item>
				<u-form-item label="排序"><u-input placeholder="请输入数字" v-model="model.idcard" type="number"></u-input></u-form-item>
				<u-form-item label-position="left" label="完成付款" prop="remember" label-width="150">
					<u-switch v-model="model.remember" slot="right"></u-switch>
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
				name: '',
				phone: '',
				idcard: 1,
				remember: false
			},
			rules: {
				name: [
					{
						required: true,
						message: '请输入姓名',
						trigger: 'blur'
					}
				],
			}
		};
	},
	onReady() {
		this.$refs.uForm.setRules(this.rules);
	},
	methods: {
		submit() {
			this.$refs.uForm.validate(valid => {
				if (valid) {
					console.log(this.model);
					console.log('验证通过');
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
