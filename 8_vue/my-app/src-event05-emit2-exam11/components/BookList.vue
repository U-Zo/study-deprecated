<template>
  <div>
    <ul>
      <li v-for="(book, idx) in bookList" :key="idx">
        <a @click="x">
          <img :src="require(`../assets/image/${book.img}`)"
               width="100"
               height="100"
               :data-xxx="book.name"
          />
          {{ book.name }}
        </a>
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
  methods: {
    x(e) {
      console.log(e.target.dataset.xxx);
      this.$emit('xyz', e.target.dataset.xxx); // 책 이름 전달
    },
  },
};
</script>

<style scoped>

</style>
