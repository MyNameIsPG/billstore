<template>
	<view class="fixed-box-add">
		<view class="fixed-box-add-btn" @click="handleClickCommonAddBtn">
			<view class="circle-v"></view>
			<view class="circle-h"></view>
		</view>
	</view>
</template>

<script>
export default {
	name: 'AAddbtn',
	methods: {
		handleClickCommonAddBtn() {
			this.$emit('add-btn-click');
		}
	}
};
</script>

<style lang="stylus" scoped>
.fixed-box-add
	position fixed
	width 120rpx
	height 120rpx
	right 40rpx
	bottom 40rpx
	background #007AFF
	box-shadow 0 0 5px 2px rgba(0, 0, 0, 0.2)
	border-radius 50%
	.fixed-box-add-btn
		position relative
		width 100%
		height 100%
		.circle-v
			position absolute
			width 3px
			height 60rpx
			left 50%
			top 50%
			margin-left -1.5rpx
			margin-top -30rpx
			background-color white
			transform rotate(0deg)
			transition transform 0.3s
		.circle-h
			position absolute
			width 60rpx
			height 3px
			left 50%
			top 50%
			margin-top -1.5rpx
			margin-left -30rpx
			background-color white
			transform rotate(0deg)
			transition transform 0.3s
</style>
