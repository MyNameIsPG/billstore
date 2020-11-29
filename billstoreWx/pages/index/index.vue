<template>
	<view class="">
		<cu-custom bgColor="bg-gradual-blue" :isBack="true"><block slot="content">头像</block></cu-custom>
		<view v-for="(menu, index) in menuList" :key="index">
			<view class="cu-bar bg-white solid-bottom">
				<view class="action">
					<text class="cuIcon-title text-orange "></text>
					{{menu.title}}
				</view>
			</view>
			<view class="cu-list grid" :class="['col-' + gridCol, gridBorder ? '' : 'no-border']">
				<view class="cu-item" v-for="(item, index) in cuIconList" :key="index" v-if="index < gridCol * 2">
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
			gridCol: 4,
			gridBorder: false,
			menuList: [
				{
					title: '基础',
					children: [
						{
							cuIcon: 'cardboardfill',
							color: 'red',
							name: 'VR',
							path: 'user'
						},
						{
							cuIcon: 'recordfill',
							color: 'orange',
							name: '录像',
							path: 'user'
						},
						{
							cuIcon: 'picfill',
							color: 'yellow',
							name: '图像',
							path: 'user'
						},
						{
							cuIcon: 'noticefill',
							color: 'olive',
							name: '通知',
							path: 'user'
						},
						{
							cuIcon: 'upstagefill',
							color: 'cyan',
							name: '排行榜'
						},
						{
							cuIcon: 'clothesfill',
							color: 'blue',
							name: '皮肤'
						},
						{
							cuIcon: 'discoverfill',
							color: 'purple',
							name: '发现'
						},
						{
							cuIcon: 'questionfill',
							color: 'mauve',
							name: '帮助'
						},
						{
							cuIcon: 'commandfill',
							color: 'purple',
							name: '问答'
						},
						{
							cuIcon: 'brandfill',
							color: 'mauve',
							name: '版权'
						}
					]
				}
			],
			cuIconList: [
				{
					cuIcon: 'cardboardfill',
					color: 'red',
					name: 'VR'
				},
				{
					cuIcon: 'recordfill',
					color: 'orange',
					name: '录像'
				},
				{
					cuIcon: 'picfill',
					color: 'yellow',
					name: '图像'
				},
				{
					cuIcon: 'noticefill',
					color: 'olive',
					name: '通知'
				},
				{
					cuIcon: 'upstagefill',
					color: 'cyan',
					name: '排行榜'
				},
				{
					cuIcon: 'clothesfill',
					color: 'blue',
					name: '皮肤'
				},
				{
					cuIcon: 'discoverfill',
					color: 'purple',
					name: '发现'
				},
				{
					cuIcon: 'questionfill',
					color: 'mauve',
					name: '帮助'
				},
				{
					cuIcon: 'commandfill',
					color: 'purple',
					name: '问答'
				},
				{
					cuIcon: 'brandfill',
					color: 'mauve',
					name: '版权'
				}
			]
		};
	}
};
</script>

<style></style>
