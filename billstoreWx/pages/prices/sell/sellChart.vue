<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack>
			<block slot="content">趋势图</block>
		</cu-custom>
		<view class="wrap">
			<view class="u-tabs-box">
				<u-tabs-swiper activeColor="#f29100" ref="tabs" :list="list" :current="current" :is-scroll="false" swiperWidth="750"></u-tabs-swiper>
			</view>
			<swiper class="swiper-box" :current="swiperCurrent" @transition="transition" @animationfinish="animationfinish">
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;">
						<view class="page-box" style="padding: 30px 0;background-color: #fff;">
							 <canvas canvas-id="canvasColumn1" id="canvasColumn1" class="charts" style="background-color: #fff;" :style="{'width':cWidth+'px','height':cHeight+'px'}"></canvas>
						</view>
					</scroll-view>
				</swiper-item>
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;">
						<view class="page-box" style="padding: 30px 0;background-color: #fff;">
							 <canvas canvas-id="canvasColumn2" id="canvasColumn2" class="charts" style="background-color: #fff;" :style="{'width':cWidth+'px','height':cHeight+'px'}"></canvas>
						</view>
					</scroll-view>
				</swiper-item>
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;">
						<view class="page-box" style="padding: 30px 0;background-color: #fff;">
							 <canvas canvas-id="canvasColumn3" id="canvasColumn3" class="charts" style="background-color: #fff;" :style="{'width':cWidth+'px','height':cHeight+'px'}"></canvas>
						</view>
					</scroll-view>
				</swiper-item>
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;">
						<view class="page-box" style="padding: 30px 0;background-color: #fff;">
							 <canvas canvas-id="canvasColumn4" id="canvasColumn4" class="charts" style="background-color: #fff;" :style="{'width':cWidth+'px','height':cHeight+'px'}"></canvas>
						</view>
					</scroll-view>
				</swiper-item>
			</swiper>
		</view>
	</view>
</template>

<script>
import uCharts from '@/components/u-charts/u-charts.js';
export default {
	data() {
		return {
			list: [
				{
					name: '本周'
				},
				{
					name: '本月'
				},
				{
					name: '同比'
				},
				{
					name: '环比'
				}
			],
			current: 0,
			swiperCurrent: 0,
			tabsHeight: 0,
			dx: 0,
			loadStatus: ['loadmore','loadmore','loadmore','loadmore'],
			pixelRatio: 1,
			cWidth: "",
			cHeight: ""
		};
	},
	onLoad() {
		this.cWidth = uni.upx2px(750);
		this.cHeight = uni.upx2px(500);
	},
	onReady() {
		this.getServerData();
	},
	methods: {
		getServerData(){
			let Column = {
			  "categories": [
			    "2012",
			    "2013",
			    "2014",
			    "2015",
			    "2016",
			    "2017"
			  ],
			  "series": [
			    {
			      "name": "成交量1",
			      "data": [
			        15,
			        {
			          "value": 20,
			          "color": "#f04864"
			        },
			        45,
			        37,
			        43,
			        34
			      ],
			      "color": "#1890ff",
			      "index": 0,
			      "type": "column",
			      "show": true,
			      "pointShape": "circle",
			      "legendShape": "rect"
			    },
			    {
			      "name": "成交量2",
			      "data": [
			        30,
			        {
			          "value": 40,
			          "color": "#facc14"
			        },
			        25,
			        14,
			        34,
			        18
			      ],
			      "color": "#2fc25b",
			      "index": 0,
			      "type": "column",
			      "show": true,
			      "pointShape": "circle",
			      "legendShape": "rect"
			    }
			  ]
			}
			this.showColumn('canvasColumn1', Column);
			this.showColumn('canvasColumn2', Column);
			this.showColumn('canvasColumn3', Column);
			this.showColumn('canvasColumn4', Column);
		},
		showColumn(canvasId, chartData) {
			let _self = this;
			new uCharts({
				$this: _self,
				canvasId: canvasId,
				type: 'column',
				padding: [15, 15, 0, 15],
				legend: {
					show: true,
					padding: 5,
					lineHeight: 11,
					margin: 0
				},
				fontSize: 11,
				background: '#FFFFFF',
				pixelRatio: _self.pixelRatio,
				animation: false,
				categories: chartData.categories,
				series: chartData.series,
				xAxis: {
					disableGrid: true
				},
				yAxis: {
					format: val => {
						return val.toFixed(0) + '元';
					}
				},
				dataLabel: true,
				width: _self.cWidth * _self.pixelRatio,
				height: _self.cHeight * _self.pixelRatio,
				extra: {
					column: {
						type: 'group',
						width: (_self.cWidth * _self.pixelRatio * 0.45) / chartData.categories.length
					}
				}
			});
		},
		transition({ detail: { dx } }) {
			this.$refs.tabs.setDx(dx);
		},
		animationfinish({ detail: { current } }) {
			this.$refs.tabs.setFinishCurrent(current);
			this.swiperCurrent = current;
			this.current = current;
		}
	}
};
</script>

<style>
/* #ifndef H5 */
page {
	height: 100%;
	background-color: #f2f2f2;
}
/* #endif */
</style>

<style lang="scss" scoped>
.order {
	width: 710rpx;
	background-color: #ffffff;
	margin: 20rpx auto;
	border-radius: 20rpx;
	box-sizing: border-box;
	padding: 20rpx;
	font-size: 28rpx;
	.top {
		display: flex;
		justify-content: space-between;
		.left {
			display: flex;
			align-items: center;
			.store {
				margin: 0 10rpx;
				font-size: 32rpx;
				font-weight: bold;
			}
		}
		.right {
			color: $u-type-warning-dark;
		}
	}
	.item {
		display: flex;
		margin: 20rpx 0 0;
		.left {
			margin-right: 20rpx;
			image {
				width: 200rpx;
				height: 200rpx;
				border-radius: 10rpx;
			}
		}
		.content {
			.title {
				font-size: 28rpx;
				line-height: 50rpx;
			}
			.type {
				margin: 10rpx 0;
				font-size: 24rpx;
				color: $u-tips-color;
			}
			.delivery-time {
				color: #e5d001;
				font-size: 24rpx;
			}
		}
		.right {
			margin-left: 10rpx;
			padding-top: 20rpx;
			text-align: right;
			.decimal {
				font-size: 24rpx;
				margin-top: 4rpx;
			}
			.number {
				color: $u-tips-color;
				font-size: 24rpx;
			}
		}
	}
	.total {
		margin-top: 20rpx;
		text-align: right;
		font-size: 24rpx;
		.total-price {
			font-size: 32rpx;
		}
	}
	.bottom {
		display: flex;
		margin-top: 40rpx;
		padding: 0 10rpx;
		justify-content: space-between;
		align-items: center;
		.btn {
			line-height: 52rpx;
			width: 160rpx;
			border-radius: 26rpx;
			border: 2rpx solid $u-border-color;
			font-size: 26rpx;
			text-align: center;
			color: $u-type-info-dark;
		}
		.evaluate {
			color: $u-type-warning-dark;
			border-color: $u-type-warning-dark;
		}
	}
}
.centre {
	text-align: center;
	margin: 200rpx auto;
	font-size: 32rpx;
	image {
		width: 164rpx;
		height: 164rpx;
		border-radius: 50%;
		margin-bottom: 20rpx;
	}
	.tips {
		font-size: 24rpx;
		color: #999999;
		margin-top: 20rpx;
	}
	.btn {
		margin: 80rpx auto;
		width: 200rpx;
		border-radius: 32rpx;
		line-height: 64rpx;
		color: #ffffff;
		font-size: 26rpx;
		background: linear-gradient(270deg, rgba(249, 116, 90, 1) 0%, rgba(255, 158, 1, 1) 100%);
	}
}
.wrap {
	display: flex;
	flex-direction: column;
	height: calc(100vh - var(--window-top));
	width: 100%;
}
.swiper-box {
	flex: 1;
}
.swiper-item {
	height: 100%;
}
</style>
