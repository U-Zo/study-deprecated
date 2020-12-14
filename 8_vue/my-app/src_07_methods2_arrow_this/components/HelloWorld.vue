<template>
  <div>
    <h1>{{ msg }}</h1>
    <h2>현재 시간: {{ sayEcho() }}</h2>
    <h2>정보: {{ info() }}</h2>
    <h2>화살표 함수: {{ my() }}</h2>
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
      username: '홍길동',
      age: 20,
    };
  },
  methods: {
    sayEcho: () => {
      console.log(new Date().toString());
      return new Date().toString();
    },
    info() {
      console.log('info >>>>>', this);
      return this.username;
    },
    my: () => {
      console.log('my >>>>>', this);
      return `my >>>>>`, this.username;
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
