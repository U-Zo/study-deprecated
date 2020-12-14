<template>
  <div>
    1) v-text: <span v-text="x"></span><br /><!-- innerText -->
    2) v-html: <span v-html="y"></span><!-- innerHTML -->
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
      x: '홍길동',
      y: '<h1>홍길동</h1>',
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
