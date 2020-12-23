<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue"><block slot="content">洞庭水产行账务系统</block></cu-custom>
		
		<systemHome v-if="pageCur == 'systemHome' "/>
		
		<view class="cu-bar tabbar bg-white shadow foot">
			<view class="action" @click="navChange" data-cur="systemHome" >
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/basics' + [pageCur == 'systemHome' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'systemHome' ? 'text-green' : 'text-gray'">首页</view>
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
				<view :class="pageCur == 'clientMyOrder' ? 'text-green' : 'text-gray'">个人中心</view>
			</view>
		</view>
	</view>
</template>

<script>
import systemHome from '../systemHome/systemHome.vue'

export default {
	components: {
		systemHome
	},
	data() {
		return {
			pageCur: 'systemHome'
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
