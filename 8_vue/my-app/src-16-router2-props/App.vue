<template>
  <div id="app">
    <router-link to="/">Home</router-link><br>
    <router-link to='/login/홍길동'>login-foo</router-link><br>
    <router-link to='/my/1234'>pw-Baz</router-link><br>
    <router-link to='/knu'>knu</router-link><br>

    <router-view></router-view>    
  </div>
</template>

<script>
export default {
  name: 'App',

}
</script>

<style>

</style>
