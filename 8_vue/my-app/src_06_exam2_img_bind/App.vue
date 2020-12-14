<template>
  <div id="app">
    <BookList :bookList="list" />
  </div>
</template>

<script>
import BookList from '@/components/BookList';

export default {
  name: 'App',
  components: {
    BookList,
  },
  data() {
    return {
      list: [
        {
          name: '위험한 식탁',
          img: 'a.jpg',
        },
        {
          name: '공부의 비결',
          img: 'b.jpg',
        },
        {
          name: '오메르타',
          img: 'c.jpg',
        },
        {
          name: '행복한 여행',
          img: 'd.jpg',
        },
        {
          name: '해커스 토익',
          img: 'e.jpg',
        },
        {
          name: '도로 관광 안내도',
          img: 'f.jpg',
        },
      ],
    };
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
