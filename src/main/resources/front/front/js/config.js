
var projectName = '基于音乐流媒体播放及周边产品运营的信息服务管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '热门音乐',
	url: './pages/remenyinle/list.html'
}, 
{
	name: '热门歌手',
	url: './pages/remengeshou/list.html'
}, 
{
	name: '音乐周边',
	url: './pages/yinlezhoubian/list.html'
}, 

{
	name: '论坛交流',
	url: './pages/forum/list.html'
}, 
{
	name: '网站公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootl7d22/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"音乐分类","menuJump":"列表","tableName":"yinlefenlei"}],"menu":"音乐分类管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"热门音乐","menuJump":"列表","tableName":"remenyinle"}],"menu":"热门音乐管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"歌手分类","menuJump":"列表","tableName":"geshoufenlei"}],"menu":"歌手分类管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除","查看评论"],"menu":"热门歌手","menuJump":"列表","tableName":"remengeshou"}],"menu":"热门歌手管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","查看评论"],"menu":"音乐周边","menuJump":"列表","tableName":"yinlezhoubian"}],"menu":"音乐周边管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["新增","查看","修改","删除"],"menu":"论坛交流","tableName":"forum"}],"menu":"论坛交流"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"网站公告","tableName":"news"},{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["删除","查看","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"appFrontIcon":"cuIcon-circle","buttons":["删除","查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除","类销额","品销额"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","查看评论"],"menu":"热门音乐列表","menuJump":"列表","tableName":"remenyinle"}],"menu":"热门音乐模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论"],"menu":"热门歌手列表","menuJump":"列表","tableName":"remengeshou"}],"menu":"热门歌手模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论"],"menu":"音乐周边列表","menuJump":"列表","tableName":"yinlezhoubian"}],"menu":"音乐周边模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","查看评论"],"menu":"热门音乐列表","menuJump":"列表","tableName":"remenyinle"}],"menu":"热门音乐模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论"],"menu":"热门歌手列表","menuJump":"列表","tableName":"remengeshou"}],"menu":"热门歌手模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","查看评论"],"menu":"音乐周边列表","menuJump":"列表","tableName":"yinlezhoubian"}],"menu":"音乐周边模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
