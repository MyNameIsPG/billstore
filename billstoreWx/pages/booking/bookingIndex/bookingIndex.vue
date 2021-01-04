<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue"><block slot="content">洞庭水产行账务系统</block></cu-custom>
		
		<view style="padding-bottom: 74rpx;">
			<bookingHome v-if="pageCur == 'bookingHome' " />
			<bookingWork v-if="pageCur == 'bookingWork' " />
			<bookingPersonal v-if="pageCur == 'bookingPersonal' " />
		</view>
		
		<view class="cu-bar tabbar bg-white shadow foot">
			<view class="action" @click="navChange" data-cur="bookingHome" >
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/basics' + [pageCur == 'bookingHome' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'bookingHome' ? 'text-green' : 'text-gray'">首页</view>
			</view>
			<view class="action" @click="navChange" data-cur="bookingWork">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/component' + [pageCur == 'bookingWork' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'bookingWork' ? 'text-green' : 'text-gray'">工作台</view>
			</view>
			<view class="action" @click="navChange" data-cur="bookingPersonal">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/plugin' + [pageCur == 'bookingPersonal' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'bookingPersonal' ? 'text-green' : 'text-gray'">个人中心</view>
			</view>
		</view>
	</view>
</template>

<script>
import bookingHome from '../bookingHome/bookingHome.vue'
import bookingWork from '../bookingWork/bookingWork.vue'
import bookingPersonal from '../bookingPersonal/bookingPersonal.vue'
export default {
	components: {
		bookingHome,
		bookingWork,
		bookingPersonal
	},
	data() {
		return {
			pageCur: 'bookingHome'
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
