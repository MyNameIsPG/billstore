<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">出库</block></cu-custom>
		<view class="wrap" style="height: (100vh - 60px)">
			<view class="u-tabs-box">
				<u-tabs-swiper activeColor="#f29100" ref="tabs" :list="list" :current="current" @change="change" :is-scroll="false" swiperWidth="750"></u-tabs-swiper>
			</view>
			<view class="u-search-box" style="position: initial;margin: 0px;margin-top: 8px;">
				<u-search placeholder="商品规格" v-model="value" :action-style="{'color': '#409eff'}"></u-search>
			</view>
			<swiper class="swiper-box" :current="swiperCurrent" @transition="transition" @animationfinish="animationfinish">
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;" @scrolltolower="reachBottom">
						<view class="page-box" style="margin-top: 10px;">
							<view class="page-box-item">
								<view class="tips">
									分拣
								</view>
								<view class="row">
									<view class="text">SNIS20201120001</view>
								</view>
								<view class="row">
									<view class="text">商品规格：白鱼  -> 标白</view>
									<view class="text">入库价格：12.5</view>
								</view>
								<view class="row">
									<view class="text">入库数量：15000</view>
									<view class="text">入库金额：1250000</view>
								</view>
								<view class="row">
									<view class="text">入库人：系统管理员</view>
									<view class="text">2020-11-12 16:45:25</view>
								</view>
							</view>
							<u-loadmore :status="loadStatus[0]" bgColor="#f2f2f2"></u-loadmore>
						</view>
					</scroll-view>
				</swiper-item>
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;" @scrolltolower="reachBottom">
						<view class="page-box">
							
							<u-loadmore :status="loadStatus[1]" bgColor="#f2f2f2"></u-loadmore>
						</view>
					</scroll-view>
				</swiper-item>
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;">
						<view class="page-box">
							
						</view>
					</scroll-view>
				</swiper-item>
				<swiper-item class="swiper-item">
					<scroll-view scroll-y style="height: 100%;width: 100%;" @scrolltolower="reachBottom">
						<view class="page-box">
							
							<u-loadmore :status="loadStatus[3]" bgColor="#f2f2f2"></u-loadmore>
						</view>
					</scroll-view>
				</swiper-item>
			</swiper>
		</view>
		<a-addbtn @add-btn-click="addBtnClick"></a-addbtn>
	</view>
</template>

<script>
export default {
	data() {
		return {
			list: [
				{
					name: '本周'
				},
				{
					name: '本月'
				}
			],
			current: 0,
			swiperCurrent: 0,
			tabsHeight: 0,
			dx: 0,
			loadStatus: ['loadmore','loadmore','loadmore','loadmore'],
		};
	},
	onLoad() {
		
	},
	methods: {
		addBtnClick(){
			uni.navigateTo({
				url: `/pages/stock/stockWarehousing/stockWarehousingAdd`
			});
		},
		reachBottom() {
			// 此tab为空数据
			if(this.current != 2) {
				this.loadStatus.splice(this.current,1,"loading")
				setTimeout(() => {
					this.getOrderList(this.current);
				}, 1200);
			}
		},
		// 页面数据
		getOrderList(idx) {
			for(let i = 0; i < 5; i++) {
				let index = this.$u.random(0, this.dataList.length - 1);
				let data = JSON.parse(JSON.stringify(this.dataList[index]));
				data.id = this.$u.guid();
				this.orderList[idx].push(data);
			}
			this.loadStatus.splice(this.current,1,"loadmore")
		},
		// tab栏切换
		change(index) {
			this.swiperCurrent = index;
			this.getOrderList(index);
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
.page-box-item {
	border-bottom: 1px solid #eee;
	background: #FFFFFF;
	padding: 10px;
	box-sizing: border-box;
	position: relative;
	&:last-child {
		border-bottom: none;
	}
	.tips {
		position: absolute;
		right: 15px;
		top: 15px;
		font-size: 13px;
	}
	.row {
		display: flex;
		font-size: 13px;
		line-height: 30px;
		.text {
			flex: 1;
		}
		.text:first-child {
			
		}
	}
}
</style>
