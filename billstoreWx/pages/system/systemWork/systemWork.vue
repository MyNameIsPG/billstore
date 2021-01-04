<template>
	<view>
		<view v-for="(menu, index) in menuList" :key="index">
			<view class="cu-bar bg-white solid-bottom" style="border-bottom: 1px solid #eee;">
				<view class="action">
					<text class="cuIcon-title text-orange "></text>
					{{ menu.title }}
				</view>
			</view>
			<view class="cu-list grid col-5 no-border">
				<view class="cu-item" v-for="(item, indexs) in menu.children" :key="item.path" @click="handleClickBaseBtn(item.path)">
					<view :class="['cuIcon-' + item.cuIcon, 'text-' + item.color]"></view>
					<text>{{ item.name }}</text>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				// userInfo: JSON.parse(uni.getStorageSync('userInfo')),
				gridCol: 5,
				menuList: [
					{
						title: '基础',
						children: [
							{
								cuIcon: 'cardboardfill',
								color: 'red',
								name: '人员',
								path: '/pages/basics/users/users'
							},
							{
								cuIcon: 'recordfill',
								color: 'orange',
								name: '角色',
								path: '/pages/basics/roles/roles'
							},
							{
								cuIcon: 'picfill',
								color: 'yellow',
								name: '客户',
								path: '/pages/basics/clients/clients'
							},
							{
								cuIcon: 'picfill',
								color: 'yellow',
								name: '供应商',
								path: '/pages/basics/suppliers/suppliers'
							},
							{
								cuIcon: 'noticefill',
								color: 'olive',
								name: '商品',
								path: '/pages/basics/goods/goods'
							},
							{
								cuIcon: 'upstagefill',
								color: 'paymentmethod',
								name: '支付方式',
								path: '/pages/basics/payMode/payMode'
							},
							{
								cuIcon: 'brandfill',
								color: 'expenseCategory',
								name: '支出类别',
								path: 'pages/basics/expendType/expendType'
							},
							{
								cuIcon: 'brandfill',
								color: 'expenseCategory',
								name: '到账类别',
								path: 'pages/basics/accountType/accountType'
							}
						]
					},
					{
						title: '价格',
						children: [
							{
								cuIcon: 'cardboardfill',
								color: 'red',
								name: '进价',
								path: '/pages/prices/enter/enter'
							},
							{
								cuIcon: 'cardboardfill',
								color: 'red',
								name: '售价',
								path: '/pages/prices/sell/sell'
							},
							{
								cuIcon: 'cardboardfill',
								color: 'red',
								name: '退价',
								path: '/pages/prices/retreat/retreat'
							},
						]
					}
				]
			};
		},
		methods: {
			handleClickBaseBtn(path) {
				console.log(path);
				if (path) {
					uni.navigateTo({
						url: path
					});
				}
			}
		}
	}
</script>

<style lang="stylus">
.header-bar
	position relative
	height 200rpx
	.header-userinfo
		height 100%
		padding 0rpx 40rpx
		box-sizing border-box
		display flex
		align-items center
		justify-content center
		image
			width 100rpx
			height 100rpx
			border-radius 50%
			margin 0 auto
			display block
		text
			color #333
			margin-left 20rpx
			font-size 30rpx
</style>
