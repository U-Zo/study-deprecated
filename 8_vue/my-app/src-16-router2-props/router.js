import Vue from 'vue';
import VueRouter from 'vue-router';

import Bar from './components/Bar.vue';
import Foo from './components/Foo.vue';
import NotFound from './components/NotFound.vue';
import Knu from './components/Knu.vue';
import Baz from './components/Baz.vue';

Vue.use(VueRouter);

const routes=[
    {path:'/', component:Bar , name:'Bar'},
    {path:'/login/:id', component:Foo , name:'Foo', props:true},//속성이름사용
    {path:'/my/:pw', component:Baz , name:'Baz', props:true},//속성이름 사용
    {path:'/knu', component:Knu , name:'Knu', props:{username:'강감찬'}},
    {path:'*', component:NotFound , name:'NotFound'},    
]

const router = new VueRouter({routes});
export default router; 
