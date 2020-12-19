<template>
  <div class="hello">
      <router-link :to="{name:'Bar'}">Bar</router-link><br>
      <router-link :to="{name:'Foo'}">Foo</router-link><br>
      <router-link :to="{ name: 'Baz', params: { id: 'kkkk'}}">Baz</router-link><br>
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
