var vue = new Vue({
    el:"#app",
    data:{
      userList:[],
      user:{}
    },
    methods:{
        list:function () {
            axios.get("./user/list").then(function (response) {
                 vue.userList = response.data;
            })
        },
        findById:function (id) {
            axios.get("./user/findById/"+id).then(function (response) {
              vue.user = response.data;
            })
        },
        update:function () {
            axios.post("./user/update",this.user).then(function (response) {
                vue.list();
            })

        }
    },
    created:function () {
        this.list();
    }


	
})