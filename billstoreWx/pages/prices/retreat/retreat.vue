<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">退价</block></cu-custom>
		<!-- <u-empty text="数据为空" mode="list"></u-empty> -->
		<view class="u-search-box">
			<u-search
				@search="handleSearch"
				@custom="handleSearch"
				placeholder="请输入名称"
				v-model="KeyWord"
				:action-style="{ color: '#409eff' }"
			></u-search>
		</view>
		<view class="wrap" style="height: 100%;padding-top: 110rpx;">
			<view v-if="listData.length == 0" style="padding-top: 110rpx;"><u-empty text="列表为空" mode="list"></u-empty></view>
			<view class="item u-border-bottom" v-for="(item, index) in listData">
				<u-swipe-action :index="index" :key="item.goodsSaleId" @click="click" @open="open" :options="options" :show="item.isShow">
					<view class="cu-list menu-avatar">
						<view class="cu-item">
							<view class="cu-item-index">{{index+1}}</view>
							<view class="content">
								<view class="text-grey">
									{{item.goodsSpeName}}
								</view>
							</view>
						</view>
					</view>
				</u-swipe-action>
			</view>
			<u-loadmore v-if="listData.length > 0" :status="status" style="text-align: center;" />
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			status: 'loadmore',
			listData: [],
			page: 0,
			show: true,
			options: [{
				text: '修改',
				style: {
					backgroundColor: '#1F6ED4'
				}
			},
			{
				text: '趋势图',
				style: {
					backgroundColor: '#FF2E63'
				}
			}],
			KeyWord: '',
			totalCount: 0,
			totalInex: 0,
		};
	},
	created() {
		this.getDataList();
	},
	methods: {
		async getDataList(type) {
			const res = await this.request.apiGoodsReturnPriceGet({
				keys: this.KeyWord,
				pageIdx: this.page,
				pageSize: this.pageSize
			});
			if (res.errCode === 0) {
				if (type == 'query') {
					this.listData = res.data;
				} else {
					this.listData = [...this.listData, ...res.data];
				}
				this.totalCount = res.count;
				this.totalInex = Math.ceil(this.totalCount / this.pageSize) - 1;
				if (this.page >= this.totalInex) {
					this.status = 'nomore';
				}
			}
		},
		handleSearch() {
			this.page = 0;
			this.getDataList('query');
		},
		click(index, index1) {
			if (index1 == 1) {
				// this.list.splice(index, 1);
				uni.navigateTo({
					url: `/pages/prices/retreat/retreatChart?id=1`
				});
			} else {
				// this.list[index].show = false;
				uni.navigateTo({
					url: `/pages/prices/retreat/retreatAdd?id=1`
				});
				this.$u.toast(`修改成功`);
			}
		},
		open(index) {},
	},
	onReachBottom() {
		if (this.page >= this.totalInex) {
			this.status = 'nomore';
			return;
		}
		this.status = 'loading';
		this.page = ++this.page;
		setTimeout(() => {
			this.getDataList();
		}, 1000);
	}
};
</script>

<style lang="scss" scoped></style>
