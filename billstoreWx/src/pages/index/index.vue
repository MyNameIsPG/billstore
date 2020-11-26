<template>
  <div>
    {{motto}}
    <div>
      <counter :data="motto" :change="change"></counter>
    </div>
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
