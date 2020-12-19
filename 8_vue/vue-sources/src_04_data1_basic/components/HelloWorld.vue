<template>
  <div>
    <h1>{{ username }}, {{ age }}, {{ myAddress }}</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    username: String,
    age: {
      type: Number,
      default: 100,
    },
    myAddress: String,
  },
};
</script>

<style scoped>

</style>
