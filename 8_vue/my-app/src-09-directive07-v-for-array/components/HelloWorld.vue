<template>
  <div class="hello">
    <h1>index 없이 사용</h1>
    <ul>
      <li v-for="(value, key) in person" :key="key">
        {{ key }} : {{ value }}
      </li>
    </ul>
    <h1>index 지정 사용</h1>
    <ul>
      <li v-for="(value, key, index) in person" :key="index">
        {{ index + 1 }} : {{ key }} : {{ value }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      person: {
        username: '홍길동',
        age: 20,
        address: '서울',
      },
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
