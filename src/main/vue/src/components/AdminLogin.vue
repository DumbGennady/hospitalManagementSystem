<template>
  <div class="page">
    <h1>
      Admin Login 
    </h1>
      <div class="form">
        <div>
            <label for="username">Username:</label>
            <input type="text" v-model="username" id="username" placeholder="Enter username"/>
          </div>
        <div>
          <label for="password">Password:</label>
          <input type="password" v-model="password" id="password" placeholder="Enter password"/>
        </div>
    </div>
    <button @click="Login"> Login </button>
  </div>
</template>

<script>
export default {
    name: 'AdminLogin',
    data() {
      return{
        password : '',
        username : '',
      }
    },
    methods: {
      Login(){
        if(this.validateInput()){
                this.axios.get("http://localhost:9090/rest/admin/login",
                {
                  params: {
                    username: this.username,
                    password: this.password,
                    userType: "admin"
                  }
                }
                ).then((res) => {
                    if(res.data !== 1)this.$notify("Username/password does not match")
                    if(res.data === 1)alert("Login successful");
                    console.log(res);
                }
        )}
      },
      
      validateInput(){
        if(this.password === '' || this.username === ''){
          alert("Please enter username/password")
          return false;
        }
        return true;
      }
    }
}
</script>

<style>
label { 
    display: block; 
    width: 200px; 
    margin-top: 10px;
    margin-bottom: 5px;
}
button {
    margin-top: 20px;
    margin-left: 55px;
}
.page{
    margin-left:40%;
}
.form{
    margin-left:10px;
}
h1{
  margin-left:10px;
}
</style>