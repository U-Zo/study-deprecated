<template>
  <div class="hello">
    <h1>교제 정보</h1>
    <div v-for="(book, idx) in bookList" :key="idx">
      <input type="checkbox" :value="book.name" v-model="books">{{ book.name }}
      <span>가격: {{ book.price }}</span>
      <button @click="del" :data-idx="idx">삭제</button>
    </div>
    <hr />
    <button @click="allDel">선택 삭제</button>
    <hr />
    {{ books }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  data() {
    return {
      bookList: [
        { name: '자바의 정석', price: 2000 },
        { name: 'jsp 정석', price: 3000 },
        { name: 'Spring의 정석', price: 4000 },
        { name: 'jQuery의 정석', price: 1000 },
        { name: 'Angular의 정석', price: 5000 },
      ],
      books: [], // 선택한 책 목록
    };
  },
  methods: {
    del(e) {
      const index = parseInt(e.target.dataset.idx);
      this.bookList = this.bookList.filter((book, idx) => idx !== index);
    },
    allDel() {
      this.bookList = this.bookList.filter((book) =>
          book.name !== this.books.find(sBook => sBook === book.name));
    },
  },
}
;
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
