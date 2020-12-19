<template>
  <div class="hello">
    <h1>자식에서 부모로 이벤트 발생</h1>
    <button @click="x">부모에게 요청</button>
    <button @click="x2">부모에게 요청</button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  methods: {
    x() {
      console.log('자식 x의 this ===', this);
      this.$emit('xyz');
      // 자식에서 부모로 전달될 이벤트 명칭 (이벤트명)
    },
    x2() {
      console.log('자식 x2의 this ===', this);
      this.$emit('xyz2', 100, '홍길동');
      // 자식에서 부모로 전달될 이벤트 명칭 xyz2 데이터 두 개 넘김
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
