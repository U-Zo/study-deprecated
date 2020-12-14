<template>
  <div id="app">
    <HelloWorld v-if="view" />
    <button v-on:click="toggle">토글</button>
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld';

export default {
  name: 'App',
  components: {
    HelloWorld,
  },
  data() {
    return {
      view: false,
    };
  },
  methods: {
    toggle() {
      this.view = !this.view;
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
