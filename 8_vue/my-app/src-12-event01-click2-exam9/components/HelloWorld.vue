<template>
  <div class="hello">
    <h1>이벤트 실습</h1>
    가격: <input v-model="price"><br />
    갯수:
    <select @change="sum" v-model="quantity">
      <option>10</option>
      <option>20</option>
      <option>30</option>
    </select>
    총합: {{ total }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      price: '',
      quantity: '',
      total: '',
    };
  },
  methods: {
    sum() {
      this.total = parseInt(this.price) * parseInt(this.quantity);
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
