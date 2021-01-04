<template>
	<view>
		<view class="u-flex user-box u-p-l-30 u-p-r-20 u-p-b-30">
			<view class="u-m-r-10">
				<u-avatar :src="pic" size="140"></u-avatar>
			</view>
			<view class="u-flex-1">
				<view class="u-font-18 u-p-b-20">uView ui</view>
				<view class="u-font-14 u-tips-color">微信号:helang_uView</view>
			</view>
			<view class="u-m-l-10 u-p-10">
				<u-icon name="arrow-right" color="#969799" size="28"></u-icon>
			</view>
		</view>
		
		
		<view class="u-m-t-20">
			<u-cell-group>
				<u-cell-item  title="订单"></u-cell-item>
				<u-cell-item  title="财务"></u-cell-item>
				<u-cell-item  title="库存"></u-cell-item>
				<u-cell-item  title="报表"></u-cell-item>
				<u-cell-item  title="价格"></u-cell-item>
				<u-cell-item  title="资料"></u-cell-item>
			</u-cell-group>
		</view>
		
		<view class="u-m-t-20">
			<u-cell-group>
				<u-cell-item  title="设置"></u-cell-item>
			</u-cell-group>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				pic:'https://uviewui.com/common/logo.png',
				show:true
			}
		},
		methods: {
			
		}
	}
</script>

<style lang="scss">
page{
	background-color: #ededed;
}

.camera{
	width: 54px;
	height: 44px;
	
	&:active{
		background-color: #ededed;
	}
}
.user-box{
	background-color: #fff;
}
</style>
