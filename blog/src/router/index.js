//引入vue和 router
import Vue from 'vue'
import Router from 'vue-router'
//引入各个界面
import Hello from '@/components/Hello'
import Library from '@/components/Library'
import About from '@/components/About'
import Contact from '@/components/Contact'
import Detail from '@/components/Detail'

//启用router
Vue.use(Router)
//配置各个页面的路由路径对应的组件页
export default new Router({
  //linkActiveClass:'selected',
  linkExactActiveClass:'selected',
  routes: [
    {
      path: '/',
      name: 'Hello2345',
      component: Hello
    },
    {
      path: '/library',
      name: 'Library',
      component: Library
    },
    {
      path: '/about',
      name: 'About',
      component: About
    },
    {
      path: '/contact',
      name: '/Contact',
      component: Contact
    },
    {
      path: '/detail',
      name: '/Detail',
      component: Detail
    }
  ]
})
