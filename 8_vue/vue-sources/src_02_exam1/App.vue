<template>
  <div id="app">
    <BookList name="도서 목록"/>
  </div>
</template>

<script>

import BookList from '@/components/BookList';
export default {
  name: 'App',
  components: {
    BookList,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}
</style>
