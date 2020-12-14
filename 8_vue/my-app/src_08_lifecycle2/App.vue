<template>
  <div id="app">
    <HelloWorld />
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
      mesg: 'App Component',
    };
  },
  // lifecycle hook => arrow 함수 사용 x
  beforeCreate() {
    console.log('beforeCreate', this);
  },
  created() {
    console.log('app.created');
  },
  beforeMount() {
    console.log('app.beforeMount');
  },
  mounted() {
    console.log('app.mounted');
  },
  beforeUpdate() {
    console.log('app.beforeUpdate');
  },
  updated() {
    console.log('app.updated');
  },
  beforeDestroy() {
    console.log('app.beforeDestroy');
  },
  destroyed() {
    console.log('app.destroyed');
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
