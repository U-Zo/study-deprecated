<template>
  <div class="hello">
    <h1>{{ mesg }}</h1>
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    mesg: String,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
