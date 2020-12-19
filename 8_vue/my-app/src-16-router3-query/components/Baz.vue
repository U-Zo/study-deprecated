<template>
  <div class="hello">
    <h1>Baz</h1>
    {{$route.query.foo}}<br>
  </div>
</template>

<script>
export default {
  name: 'Baz'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
