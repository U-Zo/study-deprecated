<template>
  <div class="hello">
    <h1>2. 이벤트 전파 방지</h1>
    <div style="background-color: yellow" @click="aaa">
      aaa
      <div style="background-color: green" @click="bbb">
        bbb
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  methods: {
    aaa() {
      console.log('aaa');
    },
    bbb(e) {
      console.log('bbb');
      e.stopPropagation();
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
