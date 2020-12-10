<template>
	<view class="fixed-box-add" :style="{ bottom: bottom + 'px', right: right + 'px' }" @tap="handleClick" @touchstart="start" @touchmove.native.stop="move" @touchend="end">
		<view class="fixed-box-add-btn">
			<view class="circle-v"></view>
			<view class="circle-h"></view>
		</view>
	</view>
</template>

<script>
export default {
	name: 'AAddbtn',
	data() {
		return {
			bottom: 20,
			right: 20,
			pageX: 0,
			pageY: 0,
			ismove: false
		};
	},
	methods: {
		start(e) {
			let page = e.changedTouches[0];
			this.pageX = page.pageX;
			this.pageY = page.pageY;
		},
		move(e) {
			let { pageX, pageY, bottom, right } = this;
			let page = e.changedTouches[0];
			let x = page.pageX - pageX;
			let y = page.pageY - pageY;
			this.pageX = page.pageX;
			this.pageY = page.pageY;
			this.right = right - x;
			this.bottom = bottom - y;
		},
		end(e) {
			let page = e.changedTouches[0];
		},
		handleClick() {
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
	background-image linear-gradient(45deg, #0081ff, #1cbbb4)
	box-shadow 0 0 5px 2px rgba(0, 0, 0, 0.2)
	border-radius 50%
	z-index 999
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
