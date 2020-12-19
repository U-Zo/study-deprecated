<template>
  <div class="hello">
    <h1>이벤트 버스 실습</h1>
    <button @click="x">HelloWorld2로 전달</button>
  </div>
</template>

<script>
import eventBus from '@/components/eventBus';

export default {
  name: 'HelloWorld',
  props: {},
  methods: {
    x() {
      console.log('x() ======');
      eventBus.$emit('xyz', 10, 20);
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
