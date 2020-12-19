<template>
  <div class="hello">
    이름 <input type="text" v-model="name"><br />
    <p v-if="name.length < 3">이름은 3글자 이상이어야 합니다.</p>
    나이 <input type="text" v-model="age"><br />
    <p v-if="age < 10 || age > 120">나이는 10세 이상 120세 이하여야합니다.</p>
    이름 길이는: {{ name.length }} / 나이는: {{ age }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      name: '',
      age: 0,
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

p {
  color: red;
}
</style>
