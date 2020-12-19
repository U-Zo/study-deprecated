<template>
  <div class="hello">
    값: {{ num }}<br />
    {{ xxx() }}{{ xxx() }}{{ xxx() }}<br />
    {{ yyy }}{{ yyy }}{{ yyy }}<br>
    {{ change() }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      num: 30,
    };
  },
  methods: {
    xxx() {
      console.log('xxx methods 호출', this.num);
    },
    change() {
      this.num = 40;
    },
  },
  computed: { // methods와 동일하나 {{ 속성명 }}으로 사용, 한 번만 호출
    yyy() {
      console.log('yyy computed 호출', this.num);
      return ''; // 리턴 값 필요
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
