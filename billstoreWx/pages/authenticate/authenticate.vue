<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue">
			<block slot="content">授权</block>
		</cu-custom>
		<view class="titles">洞庭水产行账务系统</view>
		<view class="title-sub">
			<view>我允许系统读取并保存我微信号</view>
			<view>我允许系统读取并保存我微信头像</view>
			<view>我允许系统读取并保存我微信手机号</view>
			<view>我允许系统读取并保存我个人信息</view>
		</view>
		<form style="padding: 0 10px; display: block; box-sizing: border-box;">
			<view class="cu-form-group margin-top">
				<input type="text" placeholder="请输入姓名" v-model="form.truename"></input>
			</view>
			<view class="cu-form-group">
				<input type="text" placeholder="请输入身份证号" v-model="form.phone"></input>
			</view>
			<view class="cu-form-group">
				<input type="text" placeholder="请输入手机号" v-model="form.phone"></input>
			</view>
			<radio-group class="block" @change="RadioChange">
				<view class="cu-form-group margin-top">
					<radio :class="radio=='1'?'checked':''" :checked="radio=='1'?true:false" value="1">管理员</radio>
					<radio :class="radio=='2'?'checked':''" :checked="radio=='2'?true:false" value="2">记账员</radio>
					<radio :class="radio=='3'?'checked':''" :checked="radio=='3'?true:false" value="3">客户</radio>
					<radio :class="radio=='4'?'checked':''" :checked="radio=='4'?true:false" value="4">供应商</radio>
				</view>
			</radio-group>
			<view class="padding flex flex-direction">
				<button class="cu-btn bg-blue lg" open-type="getUserInfo" withCredentials="true" lang="zh_CN" @getuserinfo="wxGetCode">授权</button>
			</view>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				radio: "1",
				form: {
					truename: "",
					phone: ""
				},
				isCanUse: uni.getStorageSync('isCanUse') || false //默认为true
			}
		},
		created() {
			if(this.isCanUse) {
				this.handleAdd()
			}
		},
		methods: {
			// 1、获取code
			wxGetCode() {
				let _this = this;
				uni.login({
					provider: 'weixin',
					success: resCode => {
						console.log(resCode.code)
						_this.wxGetUserInfo(resCode.code);
					},
					fail(res) {
						console.log(res);
					}
				});
			},
			// 2、根据code去的微信的用户信息
			wxGetUserInfo(code) {
				let _this = this;
				uni.getUserInfo({
					provider: 'weixin',
					success: res => {
						_this.getWxOpenid(code, res.userInfo)
					},
					fail(res) {
						console.log(res);
					}
				});
			},
			// 3、调用后台方法 获取token
			getWxOpenid(code, userInfo) {
				let _this = this
				this.$request({
					url: "api/Authraztion/DevToken"
				}).then(res=>{
					uni.setStorageSync('token', res);
					uni.setStorageSync('isCanUse', true)
					setTimeout(()=>{
						_this.handleAdd()
					},1000)
				})
			},
			RadioChange(e) {
				this.radio = e.detail.value
			},
			handleAdd() {
				console.log(this.radio)
				if(this.radio=="1"){
					uni.navigateTo({
						url: `/pages/system/systemIndex/systemIndex`
					});
				} else if(this.radio=="2"){
					uni.navigateTo({
						url: `/pages/booking/bookingIndex/bookingIndex`
					});
				} else if(this.radio=="3"){
					uni.navigateTo({
						url: `/pages/client/clientIndex/clientIndex`
					});
				} else if(this.radio=="4"){
					uni.navigateTo({
						url: `/pages/supplier/supplierIndex/supplierIndex`
					});
				} else {
					uni.navigateTo({
						url: `/pages/system/systemIndex/systemIndex`
					});
				}
				// if(!this.form.truename) {
				// 	uni.showModal({
				// 		content: "请输入真实姓名",
				// 		showCancel: false
				// 	});
				// 	return false;
				// }
				// if(!this.form.phone) {
				// 	uni.showModal({
				// 		content: "请输入手机号",
				// 		showCancel: false
				// 	});
				// 	return false;
				// }
				// this.$request({
				// 	url: '/api/wx/authenticate',
				// 	data: {
				// 		truename: this.form.truename,
				// 		phone: this.form.phone,
				// 		openId: JSON.parse(uni.getStorageSync("userInfo")).openId
				// 	}
				// }).then(res=>{
				// 	if(res.code===this.IS_OK){
				// 		uni.navigateTo({
				// 			url: `/pages/index/index`
				// 		});
				// 	} else {
				// 		uni.showModal({
				// 		    title: '温馨提示',
				// 		    content: '用户不存在，请联系管理员',
				// 		    success: function (res) {
				// 		        if (res.confirm) {
				// 		            console.log('用户点击确定');
				// 		        } else if (res.cancel) {
				// 		            console.log('用户点击取消');
				// 		        }
				// 		    }
				// 		});
				// 	}
				// })
			}
		}
	}
</script>

<style>
.titles {
	color: #333;
	font-size: 50rpx;
	text-align: center;
	margin-top: 53px;
	margin-bottom: 30px;
}
.title-sub {
	padding: 0 10px;
	box-sizing: border-box;
}
.title-sub view {
	color: #666;
	font-size: 30rpx;
	line-height: 58rpx;
}
</style>
