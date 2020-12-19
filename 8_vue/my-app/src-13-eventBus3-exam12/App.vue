<template>
  <div id="app">
    <Input msg="Welcome to Your Vue.js App" />
    <List />
  </div>
</template>

<script>
import Input from "./components/Input.vue";
import List from "./components/List.vue";

export default {
  name: "App",
  components: {
    Input,
    List,
  },
};
</script>

<style></style>
