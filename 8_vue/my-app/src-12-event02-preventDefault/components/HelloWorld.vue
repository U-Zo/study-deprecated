<template>
  <div class="hello">
    <h1>1. 기본 이벤트 처리 방지</h1>
    <a href="https://www.daum.net/" @click="x">다음 -preventDefault</a><br />
    <a href="https://www.daum.net/" target="_blank">다음2</a>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  methods: {
    x(e) {
      e.preventDefault();
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
