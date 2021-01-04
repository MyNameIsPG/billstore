<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue"><block slot="content">洞庭水产行账务系统</block></cu-custom>
		
		<view style="padding-bottom: 74rpx;">
			<systemHome v-if="pageCur == 'systemHome' " />
			<systemWork v-if="pageCur == 'systemWork' " />
			<systemPersonal v-if="pageCur == 'systemPersonal' " />
		</view>
		
		<view class="cu-bar tabbar bg-white shadow foot">
			<view class="action" @click="navChange" data-cur="systemHome" >
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/basics' + [pageCur == 'systemHome' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'systemHome' ? 'text-green' : 'text-gray'">首页</view>
			</view>
			<view class="action" @click="navChange" data-cur="systemWork">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/component' + [pageCur == 'systemWork' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'systemWork' ? 'text-green' : 'text-gray'">工作台</view>
			</view>
			<view class="action" @click="navChange" data-cur="systemPersonal">
				<view class="cuIcon-cu-image"><image :src="'/static/tabbar/plugin' + [pageCur == 'systemPersonal' ? '_cur' : ''] + '.png'"></image></view>
				<view :class="pageCur == 'systemPersonal' ? 'text-green' : 'text-gray'">个人中心</view>
			</view>
		</view>
	</view>
</template>

<script>
import systemHome from '../systemHome/systemHome.vue'
import systemWork from '../systemWork/systemWork.vue'
import systemPersonal from '../systemPersonal/systemPersonal.vue'
export default {
	components: {
		systemHome,
		systemWork,
		systemPersonal
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
