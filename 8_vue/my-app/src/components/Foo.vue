<template>
  <div>
    <h1>Foo</h1>
    <router-link to="/fooChild1">foo Child1</router-link><br />
    <router-link to="/fooChild2">foo Child2</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'Foo',
};
</script>

<style scoped>

</style>
