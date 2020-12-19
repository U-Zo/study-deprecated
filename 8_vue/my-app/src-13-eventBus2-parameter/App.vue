<template>
  <div id="app">
    <HelloWorld />
    <HelloWorld2 />
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld';
import HelloWorld2 from '@/components/HelloWorld2';

export default {
  name: 'App',
  components: {
    HelloWorld,
    HelloWorld2,
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
