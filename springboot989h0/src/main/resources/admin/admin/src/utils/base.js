const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot989h0/",
            name: "springboot989h0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot989h0/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校食堂移动预约点餐系统"
        } 
    }
}
export default base
