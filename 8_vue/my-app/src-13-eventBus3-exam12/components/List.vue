<template>
  <div>
    <ul v-for="(a, idx) in todoList" :key="idx">
      <li>{{ a }}<button v-on:click="del(idx)">삭제</button></li>
    </ul>
  </div>
</template>
<script>
import eventBus from "./EventBus";
export default {
  name: "HelloWorld2",
  data: function() {
    return {
      todoList: [],
    };
  },
  //eventBus.$on을 이용하여 처리할 이벤트 함수 등록
  created() {
    console.log("create호출");
    eventBus.$on("xyz", this.add); //이벤트함수 등록
  },
  methods: {
    add: function(m) {
      this.todoList.push(m);
    },
    del: function(idx) {
      this.todoList.splice(idx, 1);
    },
  },
};
</script>
<style scoped></style>
