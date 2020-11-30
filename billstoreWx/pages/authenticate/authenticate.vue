<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue">
			<block slot="content">认证</block>
		</cu-custom>
		<form>
			<view class="cu-form-group margin-top">
				<view class="title">姓&nbsp;&nbsp;&nbsp;名</view>
				<input type="text" placeholder="请输入真实姓名" v-model="form.truename"></input>
			</view>
			<view class="cu-form-group">
				<view class="title">手机号</view>
				<input type="text" placeholder="请输入手机号" v-model="form.phone"></input>
			</view>
			<view class="padding flex flex-direction">
				<button class="cu-btn bg-blue lg" @click="handleAdd">提交</button>
			</view>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				form: {
					truename: "",
					phone: ""
				}
			}
		},
		methods: {
			handleAdd() {
				if(!this.form.truename) {
					uni.showModal({
						content: "请输入真实姓名",
						showCancel: false
					});
					return false;
				}
				if(!this.form.phone) {
					uni.showModal({
						content: "请输入手机号",
						showCancel: false
					});
					return false;
				}
				this.$request({
					url: '/api/wx/authenticate',
					data: {
						truename: this.form.truename,
						phone: this.form.phone,
						openId: JSON.parse(uni.getStorageSync("userInfo")).openId
					}
				}).then(res=>{
					if(res.code===this.IS_OK){
						uni.navigateTo({
							url: `/pages/index/index`
						});
					} else {
						uni.showModal({
						    title: '温馨提示',
						    content: '用户不存在，请联系管理员',
						    success: function (res) {
						        if (res.confirm) {
						            console.log('用户点击确定');
						        } else if (res.cancel) {
						            console.log('用户点击取消');
						        }
						    }
						});
					}
				})
			}
		}
	}
</script>

<style>

</style>
