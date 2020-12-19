<template>
  <div class="hello">
    과일선택:
    <select v-model="result">
      <option disabled selected>과일을 선택하세요.</option>
      <option v-for="(value, key, index) in fruits" :key="index" :value="value">{{ value }}</option>
    </select><br />
    선택한 과일은: {{ result }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      fruits: {
        apple: '사과',
        banana: '바나나',
        melon: '멜론',
      },
      result: '',
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
