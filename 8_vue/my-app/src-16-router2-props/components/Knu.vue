<template>
  <div class="hello">
    <h1>Knu</h1> 
    {{username}}<br>
  
  </div>
</template>

<script>
export default {
 name: 'Foo',
 props:{
   username:String
 }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
