<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    값 입력: <input type="text" v-model="amount">
    <span v-if="amount < 100">100보다 큰 값만 입력 가능</span>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String,
  },
  data() {
    return {
      amount: 100,
    };
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
