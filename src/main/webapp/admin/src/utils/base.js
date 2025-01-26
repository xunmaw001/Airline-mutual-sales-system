const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmt7i6n/",
            name: "ssmt7i6n",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmt7i6n/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于ssm的航司互售系统的设计与实现"
        } 
    }
}
export default base
