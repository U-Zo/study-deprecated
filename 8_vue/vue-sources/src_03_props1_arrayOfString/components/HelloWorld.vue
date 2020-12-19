<template>
  <div class="hello">
    <h1>{{ username }}, {{ age }}, {{ myAddress }}</h1>
    <!-- my-address 같은 케밥 표기법으로 넘기면
     받는 쪽은 myAddress 처럼 카멜 표기법으로 받음 -->
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: ['username', 'age', 'myAddress'],
  // props: {
  //   username: String,
  //   age: String,
  //   myAddress: String,
  // },
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
