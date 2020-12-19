<template>
  <div class="hello">
    <select v-model="mesg">
      <option>10</option>
      <option>20</option>
      <option>30</option>
      <option>40</option>
    </select><br />
    <input type="text" v-model="mesg"><br />
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
      mesg: 20,
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
