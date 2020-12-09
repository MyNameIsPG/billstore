<template>
	<view>
		<view class="header-bar">
			<view class="header-userinfo">
				<view>
					<!-- <image :src="userInfo.avatarUrl"></image> -->
					<view class="text">
						亲爱的
						<text>{{ userInfo.nickname }}</text>
						养殖户欢迎您！
					</view>
				</view>
			</view>
		</view>
		<view class="data-list">
			<view class="item">
				<view class="icon">15</view>
				<view class="text">未确认订单数</view>
			</view>
			<view class="item">
				<view class="icon">150000</view>
				<view class="text">应付款总数</view>
			</view>
		</view>
		<view class="new-info">订单 SNS20200908004 是您最近下单又未付款的订单</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			userInfo: JSON.parse(uni.getStorageSync('userInfo'))
		};
	},
	methods: {}
};
</script>

<style lang="stylus">
.new-info
	color #666
	font-size 32rpx
	padding 0 40rpx
.data-list
	display flex
	margin 100rpx 0
	.item
		flex 1
		text-align center
		.icon
			width 180rpx
			height 180rpx
			border-radius 50%
			border 1px solid #ddd
			display flex
			justify-content center
			align-items center
			margin 0 auto
		.text
			color #666
			font-size 32rpx
			margin-top 20rpx
.header-bar
	position relative
	height 200rpx
	margin-top 50rpx
	.header-userinfo
		height 100%
		padding 0rpx 40rpx
		box-sizing border-box
		display flex
		align-items center
		justify-content center
		image
			width 100rpx
			height 100rpx
			border-radius 50%
			margin 0 auto
			display block
		.text
			color #333
			margin-left 20rpx
			font-size 34rpx
			margin-top 30rpx
			text
				font-size 34rpx
				color #007AFF
</style>
