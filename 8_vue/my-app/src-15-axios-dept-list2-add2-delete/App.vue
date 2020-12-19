<template>
  <div>
    <DeptAdd />
    <DeptDelete />
    <DeptList />
  </div>
</template>

<script>
//import HelloWorld from "./components/HelloWorld.vue";
import DeptAdd from "./components/DeptAdd.vue";
import DeptList from "./components/DeptList.vue";
import DeptDelete from "./components/DeptDelete.vue";

export default {
  name: "App",
  components: {
    // HelloWorld,
    DeptAdd, //등록 후 template 수정
    DeptList,
    DeptDelete,
  },
};
</script>

<style></style>
