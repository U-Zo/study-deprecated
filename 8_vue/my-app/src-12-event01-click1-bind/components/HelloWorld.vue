<template>
  <div class="hello">
    <h1>click</h1>
    <button v-on:click="handleEvent">v-on:click</button>
    <br />
    <button @[aaa]="handleEvent">@[aaa]</button>
    <br />
    <button
      v-on:click="handleEvent2"
      data-my="100"
      data-my2='{"a": 200, "b": 300}'
    >
      OK3
    </button>
    <br />
    <button @click="xxx('홍길동')">@click="xxx('홍길동')"</button>
    <button v-on:click="xxx2('홍길동', $event)">
      @click="xxx('홍길동', $event)"
    </button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      aaa: 'click',
      bbb: 'mouseover',
      ccc: 'mouseleave',
    };
  },
  methods: {
    xxx(e) {
      console.log('xxx', e);
    },
    xxx2(data, event) {
      console.log('xxx2', data, event);
    },
    handleEvent(e) {
      console.log('handleEvent', e);
    },
    handleEvent2(e) {
      console.log('handleEvent', e);
      const x = JSON.parse(e.target.dataset.my2); // 문자열을 JSON 객체로 변환
      console.log(x.a, '\t', x.b);
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
