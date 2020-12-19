<template>
  <div id="app">
    <HelloWorld
        username="홍길동"
        v-bind:age="20"
        my-address="서울"
        is-married
        v-bind:is-married2="false"
        v-bind:phones="[100, 200, 300]"
        v-bind:author="{
          name: 'Veronica',
          company: 'Veridian Dynamics'
        }"
    />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';

export default {
  name: 'App',
  components: {
    HelloWorld,
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
