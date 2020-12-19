<template>
  <div class="hello">
    <h1>교재 정보</h1>
    <div v-for="(book, index) in bookList" :key="index">
      <input type="checkbox" v-model="books" :value="book">
      {{ book.name }}
      <span>{{ book.price }}</span>
    </div>
    <hr />
    선택 교재
    <div v-for="(book, i) in books" :key="i + 100">{{ book.name }}</div>
    <hr>
    총합: {{ total }}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {},
  watch: {
    books() {
      console.log('watch 실행');
      let kkk = this.books;
      this.total = kkk.reduce((prev, curr, idx) => {
        console.log(idx, curr.name, curr.price);
        return prev + curr.price;
      }, 0);
    },
  },
  data() {
    return {
      bookList: [
        { name: '자바의 정석', price: 30000 },
        { name: 'jsp 정석', price: 40000 },
        { name: 'Spring 정석', price: 50000 },
        { name: 'jQuery 정석', price: 60000 },
        { name: 'Angular 정석', price: 70000 },
      ],
      books: [],
      total: 0,
    };
  },
};
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
