<template>
  <div id="app">
    <HelloWorld username="홍길동" v-bind:age="20" my-address="서울" />
    data x: {{ x }}, data y: {{ y }}
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',
  components: {
    HelloWorld,
  },
  data: () => {
    return {
      x: '홍길동',
      y: 40,
    };
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
