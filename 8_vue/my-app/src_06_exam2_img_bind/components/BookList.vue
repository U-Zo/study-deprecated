<template>
  <div>
    <h1>도서 목록 {{ bookList.length }}권</h1>
    <ul>
      <li v-for="(book, index) in bookList" :key="index">
        <img :src="require(`@/assets/image/${book.img}`)" alt="">
        {{ book.name }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'BookList',
  props: {
    bookList: Array,
  },
};
</script>

<style scoped></style>
