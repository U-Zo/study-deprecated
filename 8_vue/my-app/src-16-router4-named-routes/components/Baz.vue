<template>
  <div class="hello">
    <h1>Baz</h1>
    {{$route.params.id}}<br>
    {{id}}
  </div>
</template>

<script>
export default {
  name: 'Baz',
  props:{
    id:String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
