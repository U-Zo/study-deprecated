<template>
  <div id="app">
    <HelloWorld msg="HelloWorld" />
    <Happy msg="Hello Happy" />
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld';
import Happy from '@/components/Happy';

export default {
  name: 'App',
  components: {
    Happy,
    HelloWorld,
  },
};
</script>

<style scoped>

</style>
