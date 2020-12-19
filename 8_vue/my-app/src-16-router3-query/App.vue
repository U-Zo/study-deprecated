<template>
  <div class="hello">
      <router-link to="/">Home</router-link><br>
      <router-link to="/login">login</router-link><br>
      <router-link :to="{ path: '/my', query: { foo: 'baz'}}">/my?foo=baz</router-link><br>
      <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>

</style>
