<template>
  <div class="hello">
    <h1>이벤트 실습</h1>
    값1: <input v-model="num1" />
    값2: <input v-model="num2" />
    <button @click="sum">+ 계산하기</button>
    <span>{{ total }}</span>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      num1: '',
      num2: '',
      total: '',
    };
  },
  methods: {
    sum() {
      this.total = parseInt(this.num1) + parseInt(this.num2);
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
