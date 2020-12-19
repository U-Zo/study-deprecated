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
      var url = "http://localhost:8088/app/del?deptno=" + this.deptno;
      axios
        .delete(url)//delete방식 method호출
        .then((res) => {
          eventBus.$emit("xyz2", this.deptno); //xyz2로 이벤트 버스에 저장
        })
        .catch(function() {
          console.log("에러 발생");
        });
    }, //end x
  }, //end methods
};
</script>
<style scoped></style>
