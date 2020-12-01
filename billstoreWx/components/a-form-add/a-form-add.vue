<template>
	<view><slot></slot></view>
</template>

<script>
export default {
	name: 'AFormAdd',
	props: {
		model: {
			type: Object
		},
		rules: {
			type: Object
		},
		addInterface: {
			type: String
		}
	},
	data() {
		return {};
	}
};
</script>

<style></style>
