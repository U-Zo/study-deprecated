<template>
  <div class="hello">
    <h1>1. 이벤트 수식어 once</h1>
    <button @click="x">x()</button>
    <br />
    <button @click.once="x">x()</button>
    <br />

    <h1>2. preventDefault 이벤트 수식어</h1>
    <a href="https://www.daum.net/" @click="y">다음1</a>
    <br />
    <a href="https://www.daum.net/" @click="y2">다음2</a>
    <br />
    <a href="https://www.daum.net/" @click.prevent="y2">다음3 preventDefault</a>
    <br />

    <h1>3. stop 이벤트 수식어</h1>
    <div style="background-color: yellow" @click="aaa">
      aaa
      <div style="background-color: green" @click.stop="bbb">bbb</div>
    </div>

    <h1>4. enter 이벤트 수식어</h1>
    <input type="text" @keyup="xyz" />keyup
    <br />
    <input type="text" @keyup.enter="xyz" />keyup.enter
    <br />

    <h1>5. ctrl</h1>
    <input type="text" @keyup.ctrl.enter="xyz">ctrl.enter
    <br />
    <input type="text" @keyup.ctrl.up="xyz">ctrl.up
    <br />
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  methods: {
    x() {
      console.log('x');
    },
    y() {
      console.log('y');
    },
    y2() {
      console.log('y2');
    },
    aaa() {
      console.log('aaa');
    },
    bbb() {
      console.log('bbb');
    },
    xyz() {
      console.log('xyz');
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
