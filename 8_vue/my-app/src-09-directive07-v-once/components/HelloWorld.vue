<template>
  <div class="hello">
    기본: <span>{{ username }}</span><br />
    v-once 사용 안 함 <span>{{ username }}</span>
    v-once 사용 <span v-once>{{ username }}</span>
    {{ changeName() }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      username: '홍길동',
    };
  },
  methods: {
    changeName() {
      this.username = '이순신';
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
