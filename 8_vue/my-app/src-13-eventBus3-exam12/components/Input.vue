<template>
  <div class="hello">
    <input type="text" v-on:keyup.enter="add" v-model="mesg" />
  </div>
</template>

<script>
import eventBus from "./EventBus.vue"; //import
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
  data: function() {
    return {
      mesg: "",//이름 저장 변수 , 버스로 전달 
    };
  },
  methods: {
    add: function() {
      eventBus.$emit("xyz", this.mesg); //이벤트버스 전달이벤트 명 xyz
      this.mesg = ""; //초기화
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
