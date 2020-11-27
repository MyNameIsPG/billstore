<template>
	<div><button type="button" @click="dd">按钮</button></div>
</template>

<script>
export default {
	methods: {
		dd() {
			this.$emit("change", 2)
		}
	}
};
</script>

<style></style>
