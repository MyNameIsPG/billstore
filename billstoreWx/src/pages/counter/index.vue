<template>
  <div class="counter-warp">
    <p>
      <button @click="increment">+</button>
    </p>
  </div>
</template>

<script>
// Use Vuex

export default {
  props: {
    change: Function,
  },
  computed: {
    count() {},
  },
  methods: {
    increment() {
      this.change(2);
    },
  },
};
</script>

<style>
.counter-warp {
  text-align: center;
  margin-top: 100px;
}
.home {
  display: inline-block;
  margin: 100px auto;
  padding: 5px 10px;
  color: blue;
  border: 1px solid blue;
}
</style>
