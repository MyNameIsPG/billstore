<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" isBack><block slot="content">趋势图</block></cu-custom>
		<u-tabs-swiper ref="tabs" :list="list" :is-scroll="false"></u-tabs-swiper>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				list: [{
									name: '待收货'
								}, {
									name: '待付款'
								}, {
									name: '待评价',
									count: 5
								}],
			}
		},
		methods: {
			
		}
	}
</script>

<style>

</style>
