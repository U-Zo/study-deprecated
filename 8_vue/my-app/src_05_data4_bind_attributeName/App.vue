<template>
  <div>
    <HelloWorld v-bind:[attributeName]="x" :age="y" v-bind:arr="z" />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',
  components: {
    HelloWorld,
  },

  data() {
    return {
      x: '홍길동',
      y: 40,
      z: [10, 20, 30],
      attributeName: 'username',
    };
  },
};
</script>

<style></style>
