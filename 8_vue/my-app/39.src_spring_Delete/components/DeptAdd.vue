<template>
  <div>
    <h2>부서등록 및 수정</h2>
    <form v-on:submit.prevent="x">
      부서번호:<input type="text" name="deptno" v-model="dept.deptno" />
      부서명:<input type="text" name="dname" v-model="dept.dname" />
      부서위치:<input type="text" name="loc" v-model="dept.loc" />
      <button>저장</button>
    </form>
  </div>
</template>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
import axios from "axios";
import eventBus from "./EventBus";
export default {
  name: "DeptAdd",
  data: function() {
    return {
      dept: {
        deptno: "",
        dname: "",
        loc: "",
      },
    };
  },
  methods: {
    x: function(e) {
      var url = "http://localhost:8080/app/add";
      console.log("==========================", this.dept);
      axios
        .post(url, {
          deptno: this.dept.deptno,
          dname: this.dept.dname,
          loc: this.dept.loc,
        })
        .then((res) => {
          eventBus.$emit("xyz", this.dept); //insert 성공후 이벤트 버스에 저장
        })
        .catch();
    },
  },
};
</script>
<style scoped></style>
