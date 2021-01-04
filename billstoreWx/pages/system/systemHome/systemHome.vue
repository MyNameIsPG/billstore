<template>
	<view class="pages" style="background: #FFFFFF;">
		<view class="titles">
			洞庭水产行账务系统
		</view>
		<view class="list">
			<view class="item">
				<view class="item-title">库存</view>
				<view class="itemList">
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
				</view>
			</view>
			<view class="item">
				<view class="item-title">销售额</view>
				<view class="itemList">
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
				</view>
			</view>
			<view class="item">
				<view class="item-title">卸货</view>
				<view class="itemList">
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
					<view class="itemListSub">
						<view class="nums">456</view>
						<view class="text">白鱼</view>
					</view>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
</script>

<style lang="scss" scoped>
	.titles {
		font-size: 48rpx;
		text-align: center;
		padding: 40rpx 0 60rpx;
		font-weight: 600;
		background: #FFFFFF;
	}
	.list {
		margin-top: 20rpx;
		margin-bottom: 30rpx;
		.item {
			margin-bottom: 30rpx;
			padding: 0 40rpx;
			box-sizing: border-box;
			.item-title {
				font-size: 30rpx;
			}
			.itemList {
				margin-top: 20rpx;
				border: 1px dotted #ccc;
				padding: 30rpx;
				box-sizing: border-box;
				display: flex;
				.itemListSub {
					width: 25%;
					.nums {
						width: 140rpx;
						height: 140rpx;
						border-radius: 50%;
						text-align: center;
						line-height: 140rpx;
						font-size: 30rpx;
						border: 1px solid #eee;
						margin: 0 auto;
					}
					.text {
						margin-top: 10rpx;
						font-size: 32rpx;
						text-align: center;
					}
				}
			}
		}
	}
</style>
