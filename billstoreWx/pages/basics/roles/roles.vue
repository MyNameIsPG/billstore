<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">角色</block></cu-custom>
		<!-- <u-empty text="数据为空" mode="list"></u-empty> -->
		<view class="u-search-box">
			<u-search placeholder="请输入名称" v-model="value" :action-style="{'color': '#409eff'}"></u-search>
		</view>
		<view class="wrap" style="height: 100%;padding-top: 110rpx;">
			<view class="item u-border-bottom" v-for="item in list">
				<u-swipe-action :index="item" @click="click" @open="open" :options="options">
					<view class="cu-list menu-avatar cu-list-index">
						<view class="cu-item">
							<view class="cu-item-index">{{item+1}}</view>
							<view class="cu-avatar round lg" style="background-image:url(https://ossweb-img.qq.com/images/lol/web201310/skin/big10001.jpg);"></view>
							<view class="content">
								<view class="text-grey">
									管理员{{ item }}
								</view>
							</view>
						</view>
					</view>
				</u-swipe-action>
			</view>
			<u-loadmore :status="status" style="text-align: center;" />
		</view>
		<a-addbtn @add-btn-click="addBtnClick"></a-addbtn>
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
			options: this.swipe_action_options,
			value: ""
		};
	},
	methods: {
		click(index, index1) {
			debugger
			if (index1 == 1) {
				// this.list.splice(index, 1);
				this.$u.toast(`删除了第${index}个cell`);
			} else {
				// this.list[index].show = false;
				uni.navigateTo({
					url: `/pages/basics/rolesAdd/rolesAdd?id=${id}`
				});
				this.$u.toast(`修改成功`);
			}
		},
		open(index) {},
		addBtnClick() {
			uni.navigateTo({
				url: `/pages/basics/rolesAdd/rolesAdd`
			});
		}
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
