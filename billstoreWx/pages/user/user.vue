<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">用户</block></cu-custom>

		<view class="cu-list menu-avatar" v-if="dataList.length > 0">
			<view class="cu-item" v-for="item in dataList" :key="item">
				<view class="cu-avatar round lg" style="background-image:url(https://ossweb-img.qq.com/images/lol/web201310/skin/big10001.jpg);"></view>
				<view class="content">
					<view class="text-grey">
						{{ item.truename }}
						<view class="cu-tag round bg-orange sm">管理员</view>
					</view>
					<view class="text-gray text-sm flex">
						<view class="text-cut">
							<text class="cuIcon-dianhua text-red margin-right-xs"></text>
							{{ item.phone }}
						</view>
					</view>
				</view>
			</view>
		</view>
		<a-nodata v-else></a-nodata>
		<a-addbtn @add-btn-click="addBtnClick"></a-addbtn>
	</view>
</template>

<script>
export default {
	data() {
		return {
			dataList: []
		};
	},
	created() {
		this.getPageList();
	},
	methods: {
		async getPageList() {
			const res = await this.request.apiUserQueryAll();
			if (res.code === this.IS_OK) {
				this.dataList = res.data;
			}
		},
		addBtnClick() {
			uni.navigateTo({
				url: `/pages/userAdd/userAdd`
			});
		},
		handleClickDetails(id) {
			uni.navigateTo({
				url: `/pages/userDetails/userDetails?id=${id}`
			});
		}
	}
};
</script>

<style></style>
