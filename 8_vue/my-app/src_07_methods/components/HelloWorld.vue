<template>
  <div>
    <h1>{{ msg }}</h1>
    <h2>{{ username }}, {{ age }}</h2>
    함수 호출 정보: {{ sayEcho() }}<br />
    함수 호출 정보: {{ test() }}
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
      username: '홍길동',
      age: 20,
    };
  },
  methods: {
    sayEcho() {
      return `${this.username}\t${this.age}`;
    },
    test() {
      return `${this.username}\t${this.age}`;
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
