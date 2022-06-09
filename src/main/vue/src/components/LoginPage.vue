<template>
  <div>
      <div>
            User Login
      </div>
      <div class = "login-container">
          <div class="login-item"> 
          <router-link to="/login/admin">
            Admin Login
          </router-link>
          </div>
          <div class="login-item"> 
          <router-link to="/login/doctor">
            Doctor Login
          </router-link>
          </div>
          <div class="login-item"> 
          <router-link to="/login/receptionist">
            Receptionist Login
          </router-link>
          </div>
      </div>
  </div>
</template>

<script>
export default {
    name: 'LoginPage'
}
</script>

<style>
.login-item{
    text-align: center;
    width: 30%;
    height: 40vh;
    background-color: burlywood;
    margin: 20px;
}
.login-container{
    display: flex;
}

</style>