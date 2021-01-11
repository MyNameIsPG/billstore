<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">到账类别</block></cu-custom>
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
				<u-swipe-action :index="index" :key="item.categoryReceiptId" @click="click" @open="open" :options="options" :show="item.isShow">
					<view class="cu-list menu-avatar cu-list-index">
						<view class="cu-item">
							<view class="cu-item-index">{{index+1}}</view>
							<view class="content" style="left: 30px;">
								<view class="text-grey">
									{{item.expenditureCategoryName}}
								</view>
							</view>
						</view>
					</view>
				</u-swipe-action>
			</view>
			<u-loadmore v-if="listData.length > 0" :status="status" style="text-align: center;" />
		</view>
		<a-addbtn @add-btn-click="addBtnClick"></a-addbtn>
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
			options: this.swipe_action_options,
			KeyWord: '',
			totalCount: 0,
			totalInex: 0
		};
	},
	created() {
		this.getDataList();
	},
	methods: {
		async getDataList(type) {
			const res = await this.request.apiCategoryReceiptDataPageList({
				KeyWord: this.KeyWord,
				pageIndex: this.page,
				pageSize: this.pageSize
			});
			if (res.ErrCode === 0) {
				if (type == 'query') {
					this.listData = res.Data.data;
				} else {
					this.listData = [...this.listData, ...res.Data.data];
				}
				this.totalCount = res.Data.totalCount;
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
			this.show = false;
			let _this = this;
			let id = this.listData[index].categoryReceiptId;
			if (index1 == 1) {
				uni.showModal({
					title: '提示',
					content: '是否删除该条数据？',
					success: async function(res) {
						if (res.confirm) {
							const res = await _this.request.apiCategoryReceiptDelete(id);
							if (res.ErrCode === 0) {
								uni.showToast({
									title: '删除成功'
								});
								_this.listData.splice(index, 1);
							} else {
								uni.showToast({
									title: '删除成功'
								});
							}
							_this.listData[index].isShow = false;
						} else if (res.cancel) {
							_this.listData[index].isShow = false;
						}
					}
				});
			} else {
				uni.navigateTo({
					url: `/pages/basics/accountTypeAdd/accountTypeAdd?id=${id}`
				});
			}
			setTimeout(() => {
				this.show = true;
			}, 10);
		},
		open(index) {
			if (this.show) {
				this.listData[index].isShow = true;
				this.listData.map((val, idx) => {
					if (index != idx) this.listData[idx].isShow = false;
				});
			}
		},
		addBtnClick() {
			uni.navigateTo({
				url: `/pages/basics/accountTypeAdd/accountTypeAdd`
			});
		}
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

<style lang="scss"></style>
