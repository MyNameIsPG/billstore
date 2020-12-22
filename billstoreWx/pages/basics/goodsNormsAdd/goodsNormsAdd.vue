<template>
	<view class="wrap">
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">商品规格</block></cu-custom>
		<view style="padding: 0 10px; box-sizing: border-box;">
			<u-form :model="model" :rules="rules" ref="uForm" :errorType="errorType" label-width="140" label-position="left">
				<u-form-item label="规格名称" prop="name"><u-input placeholder="请输入规格名称" v-model="model.name" type="text"></u-input></u-form-item>
				<u-form-item label="规格描述" prop="name"><u-input placeholder="请输入规格描述" v-model="model.name" type="text"></u-input></u-form-item>
				<u-form-item label="序号" prop="phone"><u-input placeholder="请输入序号" v-model="model.phone" type="number"></u-input></u-form-item>
				<u-form-item label-position="left" label-width="0" prop="likeFruit">
					<u-checkbox-group @change="checkboxGroupChange" :width="radioCheckWidth" :wrap="radioCheckWrap">
						<u-checkbox v-model="item.checked" v-for="(item, index) in checkboxList" :key="index" :name="item.name">{{ item.name }}</u-checkbox>
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
				name: '',
				phone: '',
				idcard: ''
			},
			radioCheckWrap: false,
			checkboxList: [
				{
					name: '可销售',
					checked: false,
					disabled: false
				},
				{
					name: '可定价',
					checked: false,
					disabled: false
				},
				{
					name: '可退货',
					checked: false,
					disabled: false
				},
				{
					name: '可进货',
					checked: false,
					disabled: false
				}
			],
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
		this.uid = option.id;
	},
	onReady() {
		this.$refs.uForm.setRules(this.rules);
	},
	methods: {
		checkboxGroupChange(e) {
			this.model.likeFruit = e;
		},
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
