<template>
  <div>
    <DeptAdd />
    <DeptList />
  </div>
</template>

<script>
//import HelloWorld from "./components/HelloWorld.vue";
import DeptAdd from "./components/DeptAdd.vue";
import DeptList from "./components/DeptList.vue";

export default {
  name: "App",
  components: {
    // HelloWorld,
    DeptAdd, //등록 후 template 수정
    DeptList,
  },
};
</script>

<style></style>
