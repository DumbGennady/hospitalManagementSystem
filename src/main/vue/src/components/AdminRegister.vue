<template>
  <div class="page">
      <h1> Register Admin </h1>
      <div class="form">
          <div>
            <label for="name">Name:</label>
            <input type="text" v-model="name" id="name" placeholder="Enter full name"/>
          </div>
          <div>
            <label for="username">Username:</label>
            <input type="text" v-model="username" id="username" placeholder="Enter username"/>
          </div>
          <div>
            <label for="email">E-Mail:</label>
            <input type="text" v-model="email" id="email" placeholder="Enter email id"/>
          </div>
          <div>
            <label for="phone">Phone No:</label>
            <input type="text" v-model="phone" id="phone" placeholder="Enter phone no"/>
          </div>
          <div>
            <label for="password">Password:</label>
            <input type="password" v-model="password" id="password" placeholder="Enter password"/>
          </div>
          <div>
            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" v-model="confirmPassword" id="confirmPassword" placeholder="Confirm password"/>
          </div>
      </div>
      <button @click="registerAdmin"> Register </button>
  </div>
</template>

<script>
export default {
    name: 'AdminRegister',
    data() {
        return {
            name: '',
            username: '',
            email: '',
            phone: '',
            password: '',
            confirmPassword: ''
        }
    },
    methods: {
        checkPasswordSame(){
            if(this.password === this.confirmPassword)return true;
            else return false;
        },
        validateInput(){
            if(!this.checkPasswordSame()){
                // this.$notify("Password do not match")
                return false;
            }
            return true;
        },
        registerAdmin(){
            if(this.validateInput()){
                this.axios.post("http://localhost:9090/rest/admin/insert",
                {
                    "name": this.name,
                    "username": this.username,
                    "email": this.email,
                    "phone": this.phone,
                    "password": this.password
                }
                ).then((res) => {
                    // if(res.data !== 1)this.$notify("Item cannot be added")
                    if(res.data === 1)alert("Admin successfully registered");
                    console.log(res);
                }
            )}
        }
    },  
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
</style>