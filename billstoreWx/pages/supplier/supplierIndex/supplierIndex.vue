<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue"><block slot="content">洞庭水产行账务系统</block></cu-custom>

		<supplierHome v-if="pageCur == 'supplierHome'" />
		<supplierPersonalInfo v-if="pageCur == 'supplierPersonalInfo'" />
		<supplierMyReceivables v-if="pageCur == 'supplierMyReceivables'" />

		<view class="cu-bar tabbar bg-white shadow foot">
			<view class="action" @click="navChange" data-cur="supplierHome">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/basics' + [pageCur == 'supplierHome' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'supplierHome' ? 'text-green' : 'text-gray'">首页</view>
			</view>
			<view class="action" @click="navChange" data-cur="supplierPersonalInfo">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/component' + [pageCur == 'supplierPersonalInfo' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'supplierPersonalInfo' ? 'text-green' : 'text-gray'">个人信息</view>
			</view>
			<view class="action" @click="navChange" data-cur="supplierMyReceivables">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/plugin' + [pageCur == 'supplierMyReceivables' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'supplierMyReceivables' ? 'text-green' : 'text-gray'">我的应收</view>
			</view>
		</view>
	</view>
</template>

<script>
import supplierHome from '../supplierHome/supplierHome.vue';
import supplierPersonalInfo from '../supplierPersonalInfo/supplierPersonalInfo.vue';
import supplierMyReceivables from '../supplierMyReceivables/supplierMyReceivables.vue';
export default {
	components: {
		supplierHome,
		supplierPersonalInfo,
		supplierMyReceivables
	},
	data() {
		return {
			pageCur: 'supplierHome'
		};
	},
	methods: {
		navChange: function(e) {
			this.pageCur = e.currentTarget.dataset.cur;
		}
	}
};
</script>

<style></style>
