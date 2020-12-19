<template>
  <div id="app">
    <h1>도서 목록 {{ list.length }}</h1>
    선택된 도서 목록 <input type="text" :value="bookName" />
    <BookList :bookList="list" @xyz="y" />
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
          id: 'p01',
          name: '위험한 식탁',
          price: 2000,
          date: '20170401',
          img: 'a.jpg',
        },
        {
          id: 'p02',
          name: '공부의 비결',
          price: 2000,
          date: '20170402',
          img: 'b.jpg',
        },
        {
          id: 'p03',
          name: '오메르타',
          price: 2000,
          date: '20170401',
          img: 'c.jpg',
        },
        {
          id: 'p04',
          name: '행복한 여행',
          price: 4000,
          date: '20170401',
          img: 'd.jpg',
        },
        {
          id: 'p05',
          name: '해커스 토익',
          price: 2000,
          date: '20170401',
          img: 'e.jpg',
        },
        {
          id: 'p06',
          name: '도로 안내서',
          price: 2000,
          date: '20170401',
          img: 'f.jpg',
        },
      ],
      bookName: '',
    };
  },
  methods: {
    y(xxx) {
      this.bookName = xxx;
    }
  }
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
