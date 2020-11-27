<template>
  <div>
    {{motto}}
    <div>
      <counter :data="motto" :change="change"></counter>
    </div>
    <cu-custom bgColor="bg-gradual-blue" :isBack="true">
      <block slot="backText">返回</block>
      <block slot="content">背景</block>
    </cu-custom>

    <view class="padding-sm">
      <view class="padding radius text-center shadow-blur bg-red">
        <view class="text-lg">嫣红</view>
        <view class="margin-top-sm text-Abc">red</view>
      </view>
    </view>
  </div>
</template>

<script>
import counter from "../counter/index.vue";
export default {
  components: {
    counter,
  },
  data() {
    return {
      motto: 1,
    };
  },
  methods: {
    change(val) {
      console.log(val);
      this.motto += val;
    },
  },
  created() {},
};
</script>

<style scoped>
</style>
