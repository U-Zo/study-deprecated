<template>
  <div id="app">
    <router-link to="/">Home</router-link><br>
    <router-link to='/login'>login</router-link><br>
    <router-view></router-view>    
    <!-- 라우팅 된 컴포넌트가 보여질 부분 -->
  </div>
</template>

<script>
export default {
  name: 'App',

}
</script>

<style>

</style>
