<template>
  <div class="hello">
    <table border="1">
      <thead>
        <tr>
          <td>부서번호</td>
          <td>부서명</td>
          <td>부서위치</td>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(dept, idx) in list" :key="idx">
          <td>{{ dept.deptno }}</td>
          <td>{{ dept.dname }}</td>
          <td>{{ dept.loc }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
import axios from "axios";
import eventBus from "./EventBus.vue";
export default {
  name: "DeptList",
  props: {},
  data: function() {
    return { list: [] };
  },
  beforeMount() {
    this.x();
  },
  //emit처리  ////////////////////////
  created() {
    eventBus.$on("xyz", this.y);//처리함수 등록 
  },
  //////////////////////////////
  methods: {
    x: function() {
      var xxx = this.list;
      //스프링에서 서버 가동후 브라우저에서 서버 주소 복/붙
      //yarn serve시 node-module없다는 에러 발생시
      //npm install --save core-js 실행
      axios
        .get("http://localhost:8088/app/")
        .then((res) => {
          console.log(res);
          res.data.map(function(ele, idx) {
            xxx.push(ele);
          });
        })
        .catch((error) => console.log(error));
    }, //end x
    y: function(dept) {//넘어온 데이터 받기 
      console.log("dept>>", dept);
      this.list.push(dept);
    }, //end y
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
