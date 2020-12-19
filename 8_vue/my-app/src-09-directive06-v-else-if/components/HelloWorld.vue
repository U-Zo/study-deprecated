<template>
  <div class="hello">
    점수: <input v-model.number="grade">
    <p v-if="grade > 90">A 학점</p>
    <p v-else-if="grade > 80">B 학점</p>
    <p v-else-if="grade > 70">C 학점</p>
    <p v-else>F 학점</p>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      grade: 50,
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
