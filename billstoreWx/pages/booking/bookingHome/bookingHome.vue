<template>
	<view style="background: #FFFFFF;">
		<view style="padding: 0 20rpx;">
			<u-collapse :accordion="false">
				<u-collapse-item title="商品分类" :open="true">
					<view class="list-type">
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
						<view class="item">
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
						<view class="item button" @click="handleClickPic"><view class="btns">展开</view></view>
					</view>
				</u-collapse-item>
				<u-collapse-item title="客户分类" :open="true">
					<view class="list-type">
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
						<view class="item">
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
						<view class="item button"><view class="btns">展开</view></view>
					</view>
				</u-collapse-item>
			</u-collapse>
			<view style="padding-bottom: 30rpx;">
				<u-table>
					<u-tr class="u-tr">
						<u-th class="u-th">商品</u-th>
						<u-th class="u-th">价格</u-th>
						<u-th class="u-th">数量</u-th>
					</u-tr>
					<u-tr class="u-tr">
						<u-td class="u-td"><u-input height="30" value="大白鱼" input-align="center" disabled :clearable="false" /></u-td>
						<u-td class="u-td"><u-input height="30" v-model="mobile" type="number" placeholder="销售价格" /></u-td>
						<u-td class="u-td"><u-input height="30" v-model="mobile" type="number" placeholder="销售数量" /></u-td>
					</u-tr>
					<u-tr class="u-tr">
						<u-td class="u-td"><u-input height="30" value="大白鱼" input-align="center" disabled :clearable="false" /></u-td>
						<u-td class="u-td"><u-input height="30" v-model="mobile" type="number" placeholder="销售价格" /></u-td>
						<u-td class="u-td"><u-input height="30" v-model="mobile" type="number" placeholder="销售数量" /></u-td>
					</u-tr>
					<u-tr class="u-tr">
						<u-td class="u-td"><u-input height="30" value="大白鱼" input-align="center" disabled :clearable="false" /></u-td>
						<u-td class="u-td"><u-input height="30" v-model="mobile" type="number" placeholder="销售价格" /></u-td>
						<u-td class="u-td"><u-input height="30" v-model="mobile" type="number" placeholder="销售数量" /></u-td>
					</u-tr>
				</u-table>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			mobile: ''
		};
	},
	methods: {
		handleClickPic() {
			uni.navigateTo({
				url: `/pages/booking/bookingSearch/bookingSearch`
			});
		}
	}
};
</script>

<style lang="scss" scoped>
.titles {
	font-size: 48rpx;
	text-align: center;
	padding: 40rpx 0 60rpx;
	font-weight: 600;
	background: #ffffff;
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
