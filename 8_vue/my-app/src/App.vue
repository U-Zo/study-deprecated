<template>
  <div id="app">
    <router-link :to="{ name: 'Bar' }">Bar</router-link><br />
    <router-link :to="{ name: 'Foo' }">Foo</router-link><br />
    <router-link :to="{ name: 'Baz', params: { id: 'kkkk' } }">Baz</router-link><br />
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App',
  components: {},
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
