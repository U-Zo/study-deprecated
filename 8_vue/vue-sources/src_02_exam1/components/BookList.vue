<template>
  <div>
    <h1>{{ name }}</h1>
    <ul>
      <li v-for="(book, idx) in books" :key="idx">
        <img src="../assets/image/" width="100" height="100" />
        {{ book.name }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'BookList',
  data() {
    return {
      name: '도서 목록',
      books: [
        {
          name: '위험한 식탁',
          img: 'a.jpg',
        },
        {
          name: '공부의 비결',
          img: 'b.jpg',
        },
        {
          name: '오메트라',
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
          name: '도로 안내서',
          img: 'f.jpg',
        },
      ],
    };
  },
};
</script>

<style scoped>

</style>
