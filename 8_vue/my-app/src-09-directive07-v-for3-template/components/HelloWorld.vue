<template>
  <div class="hello">
    <h1>1. 기본</h1>
    <div v-for="(name, idx) in names" :key="idx + 10" id="01">{{ name }}님</div>
    <h1>2. div태그로 그룹핑: div 태그가 흔적으로 남음</h1>
    <div v-for="(name, idx) in names" :key="idx + 100" id="02">
      <span>{{ name }}</span>
      <span>님</span>
    </div>
    <h1>3. template 태그로 그룹핑: template 태그가 흔적으로 안 남음</h1>
    <template v-for="(name, idx) in names" id="03">
      <span :key="idx + 1">{{ name }}</span>
      <span :key="idx + 20"></span><br :key="idx + 50">
    </template>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      names: ['홍길동', '이순신', '유관순'],
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
