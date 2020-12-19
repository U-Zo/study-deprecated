import Vue from 'vue';
import VueRouter from 'vue-router';
import Foo from '@/components/Foo';
import Bar from '@/components/Bar';
import FooChild1 from '@/components/FooChild1';
import FooChild2 from '@/components/FooChild2';
import NotFound from '@/components/NotFound';

Vue.use(VueRouter);

const routes = [
  { path: '/', component: Bar, name: 'Bar' },
  {
    path: '/foo', component: Foo, name: 'Foo',
    children: [
      { path: '/fooChild1', component: FooChild1 },
      { path: '/fooChild2', component: FooChild2 },
    ],
  },
  { path: '*', component: NotFound, name: 'NotFound' },
];

const router = new VueRouter({ routes });
export default router;
