<template>
  <div class="hello">
    <div>
      <div>좋아하는 과일을 선택하세요</div>
      <input type="checkbox" v-model="fruit" value="사과">사과<br />
      <input type="checkbox" v-model="fruit" value="배">배<br />
      <input type="checkbox" v-model="fruit" value="바나나">바나나<br />
      <input type="checkbox" v-model="fruit" value="수박">수박<br />
      선택한 과일은: <br />
      {{ fruit }}
    </div>
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
      fruit: [],
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
