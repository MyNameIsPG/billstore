<template>
	<view class="">
		<cu-custom bgColor="bg-gradual-blue" :isBack="true">
			<block slot="backText">返回</block>
			<block slot="content">头像</block></cu-custom>
		<image class="logo" src="/static/logo.png"></image>
		<view class="text-area">
		</view>
		{{ nums }}
		<Test @change="change"></Test>
		<form>
			<view class="cu-form-group margin-top">
				<view class="title">邮件</view>
				<input placeholder="两字短标题" name="input"></input>
			</view>
			<view class="cu-form-group">
				<view class="title">输入框</view>
				<input placeholder="三字标题" name="input"></input>
			</view>
			</form>
	</view>
</template>

<script>
import Test from '../test/index.vue';
export default {
	components: {
		Test
	},
	data() {
		return {
			title: 'Hello',
			nums: 1
		};
	},
	onLoad() {},
	methods: {
		change(val) {
			this.nums += val;
			console.log(this.nums);
		}
	}
};
</script>

<style>
</style>
