<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue"><block slot="content">洞庭水产行账务系统</block></cu-custom>
		
		<clientHome v-if="pageCur == 'clientHome' "/>
		<clientPersonalInfo v-if="pageCur == 'clientPersonalInfo' "/>
		<clientMyReceivables v-if="pageCur == 'clientMyReceivables' "/>
		<clientMyOrder v-if="pageCur == 'clientMyOrder' "/>
		
		<view class="cu-bar tabbar bg-white shadow foot">
			<view class="action" @click="navChange" data-cur="clientHome" >
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/basics' + [pageCur == 'clientHome' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'clientHome' ? 'text-green' : 'text-gray'">首页</view>
			</view>
			<view class="action" @click="navChange" data-cur="clientPersonalInfo">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/component' + [pageCur == 'clientPersonalInfo' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'clientPersonalInfo' ? 'text-green' : 'text-gray'">个人信息</view>
			</view>
			<view class="action" @click="navChange" data-cur="clientMyReceivables">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/plugin' + [pageCur == 'clientMyReceivables' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'clientMyReceivables' ? 'text-green' : 'text-gray'">我的应收</view>
			</view>
			<view class="action" @click="navChange" data-cur="clientMyOrder">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/plugin' + [pageCur == 'clientMyOrder' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'clientMyOrder' ? 'text-green' : 'text-gray'">我的订单</view>
			</view>
		</view>
	</view>
</template>

<script>
import clientHome from '../clientHome/clientHome.vue'
import clientPersonalInfo from '../clientPersonalInfo/clientPersonalInfo.vue'
import clientMyReceivables from '../clientMyReceivables/clientMyReceivables.vue'
import clientMyOrder from '../clientMyOrder/clientMyOrder.vue'
export default {
	components: {
		clientHome,
		clientPersonalInfo,
		clientMyReceivables,
		clientMyOrder
	},
	data() {
		return {
			pageCur: 'clientHome'
		};
	},
	methods: {
		navChange: function(e) {
			this.pageCur = e.currentTarget.dataset.cur
		}
	}
};
</script>

<style></style>
