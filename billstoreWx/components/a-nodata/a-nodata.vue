<template>
	<div class="nodata">
		<view>
			<image src="../../static/nodata.png"></image>
			<view>暂无数据，请添加数据吧！</view>
		</view>
	</div>
</template>

<script>
export default {
	name: 'ANodata'
};
</script>

<style lang="stylus">
.nodata
	display flex
	align-items center
	justify-content center
	width 100%
	height 600rpx
	color #969799
	font-size 28rpx
	image
		display block
		margin 20rpx auto
		width 200rpx
		height 200rpx
</style>
