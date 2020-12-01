<template>
	<view>
		<cu-custom bgColor="bg-gradual-blue" :isBack="true">
			<block slot="backText">返回</block>
			<block slot="content">表单</block>
		</cu-custom>
		{{ model.truename }}
		<br />
		{{ model.phone }}
		<br />
		{{ model.idCard }}
		<br />
		{{ model.isAdmin }}
		<br />
		<a-form-add :model="model">
			<view class="cu-form-group margin-top">
				<view class="title">真实姓名</view>
				<input type="text" v-modell="model.truename" />
			</view>
			<view class="cu-form-group">
				<view class="title">手机号码</view>
				<input type="text" v-modell="model.phone" />
			</view>
			<view class="cu-form-group">
				<view class="title">身份证号</view>
				<input type="text" v-modell="model.idCard" />
			</view>
			<view class="cu-form-group">
				<view class="title">是否管理员</view>
				<switch @change="handelChangeIsAdmin" :class="model.isAdmin ? 'checked' : ''" :checked="model.isAdmin ? true : false"></switch>
			</view>
		</a-form-add>
	</view>
</template>

<script>
export default {
	data() {
		return {
			model: {
				truename: '',
				phone: '',
				idCard: '',
				isAdmin: false
			}
		};
	},
	methods: {
		handelChangeIsAdmin(e) {
			this.model.isAdmin = e.detail.value;
		}
	}
};
</script>

<style></style>
