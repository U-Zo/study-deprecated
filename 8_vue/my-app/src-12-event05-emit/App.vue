<template>
  <div id="app">
    <HelloWorld :xyz="y" :xyz2="y2" />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';

export default {
  name: 'App',
  components: {
    HelloWorld,
  },
  methods: {
    y() {
      console.log('부모의 y 호출 ======');
    },
    y2(v, v2) {
      console.log('부모의 y2 호출 ======', v, '\t', v2);
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
}
</style>
