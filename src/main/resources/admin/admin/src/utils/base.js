const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootl7d22/",
            name: "springbootl7d22",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootl7d22/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于音乐流媒体播放及周边产品运营的信息服务管理系统"
        } 
    }
}
export default base
