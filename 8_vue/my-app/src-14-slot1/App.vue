<template>
  <div id="app">
    <HelloWorld mesg="안녕하세요">
      <!-- slot영역 -->
      <div>아름다운 밤입니다.</div>
      <!-- slot영역 --> 
      </HelloWorld><!--주의-->
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld.vue";

export default {
  name: "App",
  components: {
    HelloWorld,
  },
};
</script>

<style></style>
