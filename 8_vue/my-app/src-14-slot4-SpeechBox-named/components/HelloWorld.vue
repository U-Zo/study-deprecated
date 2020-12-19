<template>
  <div class="hello">
    <slot name="headerText" />
    <slot name="speechBox" />
    <slot name="footerText" />
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {},
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
