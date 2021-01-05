<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">查询</block></cu-custom>
		<view class="u-search-box">
			<u-search v-model="value" :action-style="{'color': '#409eff'}"></u-search>
		</view>
		<view style="margin-top: 110rpx;padding-bottom: 40px;">
			<view class="list-type" >
				<view class="item active">
					<view class="item-head">大白</view>
					<view class="item-text">
						<text class="item-text1">12.3</text>
						<text class="item-text2">500</text>
					</view>
				</view>
				<view class="item">
					<view class="item-head">大白</view>
					<view class="item-text">
						<text class="item-text1">12.3</text>
						<text class="item-text2">500</text>
					</view>
				</view>
				<view class="item active">
					<view class="item-head">大白</view>
					<view class="item-text">
						<text class="item-text1">12.3</text>
						<text class="item-text2">500</text>
					</view>
				</view>
				<view class="item" v-for="item in 200" :key="item">
					<view class="item-head">大白</view>
					<view class="item-text">
						<text class="item-text1">12.3</text>
						<text class="item-text2">500</text>
					</view>
				</view>
			</view>
		</view>
		<view style="padding: 10px 10px; box-sizing: border-box; position: fixed; bottom: 0px; left: 0px; width: 100%; background: #fff;"><u-button type="primary" @click="submit">提交</u-button></view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				value: ""
			}
		},
		methods: {
			
		}
	}
</script>

<style lang="scss">
	page {
		background: #FFFFFF;
	}
.list-type {
	display: flex;
	flex-wrap: wrap;
	padding: 0 10rpx;
	.item {
		flex: 0 0 25%;
		margin-bottom: 30rpx;
		padding: 0rpx 10rpx;
		box-sizing: border-box;
		.item-head {
			padding-top: 10rpx;
			font-size: 36rpx;
			font-weight: bold;
			background: #eee;
			text-align: center;
		}
		.item-text {
			background: #eee;
			text-align: center;
			padding-bottom: 10rpx;
			.item-text1 {
				font-size: 30rpx;
				margin-right: 10rpx;
			}
			.item-text2 {
				font-size: 26rpx;
			}
		}
		&.active {
			.item-head {
				background: rgb(227, 230, 115);
			}
			.item-text {
				background: rgb(227, 230, 115);
			}
		}
		&.button {
			background: #ffffff;
			.btns {
				background: #169bd5;
				color: #fff;
				padding: 30rpx 0;
				box-sizing: border-box;
				text-align: center;
				font-size: 32rpx;
			}
		}
	}
}
</style>
