<template>
  <div>
    mesg: <input type="text" v-model="mesg"><br /><!-- 양방향 바인딩 -->
    mesg: <input type="text" v-model="mesg"><br />
    v-bind:value="mesg" <input type="text" v-bind:value="mesg">
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
      mesg: '홍길동',
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
