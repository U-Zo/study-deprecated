<template>
  <div class="hello">
    <h1>
      <p>{{ username }}</p>
      <p>{{ age }}</p>
      <p>{{ myAddress }}</p>
      <p>{{ isMarried }}</p>
      <p>{{ !isMarried2 }}</p>
      <p>{{ phones }}</p>
      <p>{{ author.name }}</p>
      <p>{{ author.company }}</p>
    </h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    username: String,
    age: Number,
    myAddress: String,
    isMarried: Boolean,
    isMarried2: Boolean,
    phones: Array,
    author: Object,
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
