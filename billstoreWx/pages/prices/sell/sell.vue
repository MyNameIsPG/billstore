<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">售价</block></cu-custom>
		<!-- <u-empty text="数据为空" mode="list"></u-empty> -->
		<view class="u-search-box">
			<u-search placeholder="请输入名称" v-model="value" :action-style="{'color': '#409eff'}"></u-search>
		</view>
		<view class="wrap" style="height: 100%;padding-top: 110rpx;">
			<view class="item u-border-bottom" v-for="item in list">
				<u-swipe-action :index="item" @click="click" @open="open" :options="options">
					<view class="cu-list menu-avatar">
						<view class="cu-item">
							<view class="content" style="left: 12px; display: flex;width: calc(100% - 24px);">
								<view class="text-grey" style="width: 50%;">
									白鱼大分类{{ item }}
								</view>
								<view class="text-grey" style="width: 50%; text-align: right;">
									50.1
								</view>
							</view>
						</view>
					</view>
				</u-swipe-action>
			</view>
			<u-loadmore :status="status" style="text-align: center;" />
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			status: 'loadmore',
			list: 20,
			page: 0,
			show: false,
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
			}
		],
			value: ""
		};
	},
	methods: {
		click(index, index1) {
			if (index1 == 1) {
				// this.list.splice(index, 1);
				uni.navigateTo({
					url: `/pages/prices/sell/sellChart?id=1`
				});
			} else {
				// this.list[index].show = false;
				uni.navigateTo({
					url: `/pages/prices/sell/sellAdd?id=1`
				});
				this.$u.toast(`修改成功`);
			}
		},
		open(index) {},
	},
	onReachBottom() {
		if (this.page >= 3) return;
		this.status = 'loading';
		this.page = ++this.page;
		setTimeout(() => {
			this.list += 20;
			if (this.page >= 3) this.status = 'nomore';
			else this.status = 'loading';
		}, 2000);
	}
};
</script>

<style lang="scss" scoped></style>
