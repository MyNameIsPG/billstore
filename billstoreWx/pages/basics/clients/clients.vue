<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">客户</block></cu-custom>
		<!-- <u-empty text="数据为空" mode="list"></u-empty> -->
		<view class="wrap">
			<view class="item u-border-bottom" v-for="item in list">
				<u-swipe-action :index="item" @click="click" @open="open" :options="options">
					<view class="cu-list menu-avatar cu-list-index">
						<view class="cu-item">
							<view class="cu-item-index">{{item+1}}</view>
							<view class="cu-avatar round lg" style="background-image:url(https://ossweb-img.qq.com/images/lol/web201310/skin/big10001.jpg);"></view>
							<view class="content">
								<view class="text-grey">
									管理员
									<view class="sm">（zs）</view>
								</view>
								<view class="text-gray text-sm flex">
									<view class="text-cut">
										<text class="cuIcon-dianhua text-red margin-right-xs"></text>
										18588773304
									</view>
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
			options: [
				{
					text: '修改',
					style: {
						backgroundColor: '#007aff'
					}
				},
				{
					text: '删除',
					style: {
						backgroundColor: '#dd524d'
					}
				}
			]
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
					url: `/pages/basics/clientsAdd/clientsAdd?id=${id}`
				});
				this.$u.toast(`修改成功`);
			}
		},
		open(index) {},
		addBtnClick() {
			uni.navigateTo({
				url: `/pages/basics/clientsAdd/clientsAdd`
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
