<template>
  <div>
    HelloWorld2
    <input type="text" :value="receive">
  </div>
</template>

<script>
import eventBus from '@/components/eventBus';

export default {
  name: 'HelloWorld2',
  data() {
    return {
      receive: '호출전',
    };
  },
  created() {
    console.log('created 호출');
    eventBus.$on('xyz', this.handleEvent);
  },
  methods: {
    handleEvent() {
      console.log('handleEvent 호출');
      this.receive = '호출 완료';
    },
  },
};
</script>

<style scoped>

</style>
