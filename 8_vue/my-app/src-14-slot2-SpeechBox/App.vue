<template>
  <div id="app">
    <HelloWorld
      mesg="안녕하세요"
      class="sanders"
      v-bind:headerText="A.header"
      v-bind:footerText="A.footer"
    >
      <!-- slot영역 -->
      <div>
        <p>{{ A.message }}</p>
      </div>
      <!-- slot영역 -->
    </HelloWorld>
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld.vue";

export default {
  name: "App",
  components: {
    HelloWorld,
  },
  data: function() {
    return {
      A: {
        header: "오바마",
        message: "저의 동료...",
        footer: "2017/01/01",
      },
      B: {
        header: "샌더슨",
        message: "감사합니다",
        footer: "2016/07/25",
      },
    };
  },
};
</script>

<style>
.sanders {
  background-color: antiquewhite;
}
.sanders-content {
  font-family: 굴림;
  text-decoration: underline;
}
</style>
