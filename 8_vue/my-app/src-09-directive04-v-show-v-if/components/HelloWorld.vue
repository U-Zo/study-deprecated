<template>
  <div class="hello">
    <p v-show=true>true</p>
    <p v-show="true">true</p>
    <p v-show="flag">flag</p>
    <p v-show="!false">!false</p>
    <p v-show="false">false</p>
    <p v-show=false>false</p>
    <p v-show="!true">!true</p>
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
      flag: true,
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
