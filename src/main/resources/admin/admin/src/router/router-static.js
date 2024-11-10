import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussyinlezhoubian from '@/views/modules/discussyinlezhoubian/list'
    import discussremengeshou from '@/views/modules/discussremengeshou/list'
    import storeup from '@/views/modules/storeup/list'
    import remenyinle from '@/views/modules/remenyinle/list'
    import forum from '@/views/modules/forum/list'
    import geshoufenlei from '@/views/modules/geshoufenlei/list'
    import yinlezhoubian from '@/views/modules/yinlezhoubian/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import orders from '@/views/modules/orders/list'
    import remengeshou from '@/views/modules/remengeshou/list'
    import yinlefenlei from '@/views/modules/yinlefenlei/list'
    import discussremenyinle from '@/views/modules/discussremenyinle/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '网站公告',
        component: news
      }
      ,{
	path: '/discussyinlezhoubian',
        name: '音乐周边评论',
        component: discussyinlezhoubian
      }
      ,{
	path: '/discussremengeshou',
        name: '热门歌手评论',
        component: discussremengeshou
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/remenyinle',
        name: '热门音乐',
        component: remenyinle
      }
      ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
      ,{
	path: '/geshoufenlei',
        name: '歌手分类',
        component: geshoufenlei
      }
      ,{
	path: '/yinlezhoubian',
        name: '音乐周边',
        component: yinlezhoubian
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/remengeshou',
        name: '热门歌手',
        component: remengeshou
      }
      ,{
	path: '/yinlefenlei',
        name: '音乐分类',
        component: yinlefenlei
      }
      ,{
	path: '/discussremenyinle',
        name: '热门音乐评论',
        component: discussremenyinle
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
