<template>
  <div>
    <h2>부서삭제</h2>
    부서번호:<input type="text" name="deptno" v-model="deptno" />
    <button v-on:click="x">삭제</button>
  </div>
</template>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
import axios from "axios";
import eventBus from "./EventBus.vue";
export default {
  name: "deptDelete",
  data: function() {
    return {
      deptno: "",
    };
  },

  methods: {
    x: function(e) {
      var url = "http://localhost:8080/app/del?deptno=" + this.deptno;
      axios
        .delete(url)
        .then((res) => {
          eventBus.$emit("xyz2", this.deptno); //xyz2로 전달
        })
        .catch(function() {
          console.log("에러 발생");
        });
    }, //end x
  }, //end methods
};
</script>
<style scoped></style>
