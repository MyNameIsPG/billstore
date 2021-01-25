<template>
	<view>
		<view>
			<view>
				<view class="header"><image src="../../static/logo.png"></image></view>
				<view class="content">
					<view>申请获取以下权限</view>
					<text>获得你的公开信息(昵称，头像、地区等)</text>
				</view>
				<button class="bottom" type="primary" open-type="getUserInfo" withCredentials="true" lang="zh_CN" @getuserinfo="wxGetCode">授权登录</button>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			isCanUse: uni.getStorageSync('isCanUse') || false //默认为true
		};
	},
	onLoad() {
		// 默认加载
		// this.wxGetCode();
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
					// _this.getWxOpenid(code, res)
					// this.$request({
					// 	url: '/api/wx/login',
					// 	data: {
					// 		code: code,
					// 		nickName: res.userInfo.nickName,
					// 		avatarUrl: res.userInfo.avatarUrl,
					// 		gender: res.userInfo.gender
					// 	}
					// }).then(res => {
					// 	uni.setStorageSync('userInfo', JSON.stringify(res.data));
					// 	uni.showLoading({
					// 		title: '登录中！'
					// 	});
					// 	setTimeout(() => {
					// 		if(res.data.role){
					// 			uni.navigateTo({
					// 				url: `/pages/index/index`
					// 			});
					// 		} else {
					// 			uni.navigateTo({
					// 				url: `/pages/authenticate/authenticate`
					// 			});
					// 		}
					// 	}, 500);
					// });
				},
				fail(res) {
					console.log(res);
				}
			});
		},
		async getWxOpenid(code, userInfo) {
			console.log(code)
			// const res = await this.request.apiUserGetWXOpenid({
			// 	code: code,
			// 	nickName: userInfo.userInfo.nickName,
			// 	avatarUrl: userInfo.userInfo.avatarUrl,
			// 	gender: userInfo.userInfo.gender
			// })
			// console.log(res)
			// uni.setStorageSync('userInfo', JSON.stringify(res.Data));
			// uni.showLoading({
			// 	title: '登录中！'
			// });
			setTimeout(() => {
				uni.navigateTo({
					url: `/pages/authenticate/authenticate`
				});
				// if(res.Data.userType==="0001"){
				// 	uni.navigateTo({
				// 		url: `/pages/system/systemIndex/systemIndex`
				// 	});
				// } else if(res.Data.userType==="0002") {
				// 	uni.navigateTo({
				// 		url: `/pages/booking/bookingIndex/bookingIndex`
				// 	});
				// } else if(res.Data.userType==="0003") {
				// 	uni.navigateTo({
				// 		url: `/pages/client/clientIndex/clientIndex`
				// 	});
				// } else if(res.Data.userType==="0004") {
				// 	uni.navigateTo({
				// 		url: `/pages/supplier/supplierIndex/supplierIndex`
				// 	});
				// }
			}, 500);
		}
	}
};
</script>

<style lang="stylus">
.header
	margin 90rpx 0 90rpx 50rpx
	border-bottom 1px solid #ccc
	text-align center
	width 650rpx
	height 300rpx
	line-height 450rpx
	image
		width 200rpx
		height 200rpx
.content
	margin-left 50rpx
	margin-bottom 90rpx
	text
		display block
		color #9d9d9d
		margin-top 40rpx
.bottom
	border-radius 80rpx
	margin 70rpx 50rpx
	font-size 35rpx
</style>
