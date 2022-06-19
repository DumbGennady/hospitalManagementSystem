<template>
  <div>
      <div>
            User Register
      </div>
      <div class = "login-container">
          <div class="login-item">
            <router-link to = "/admin-register">
            Admin Register
            </router-link>
          </div>
          <div class="login-item">
            <router-link to = "/register/doctor">
            Doctor Register
            </router-link>
          </div>
          <div class="login-item">
            <router-link to = "/register/receptionist">
            Receptionist Register
            </router-link>
          </div>
      </div>
  </div>
</template>

<script>
export default {
    name: 'RegisterPage'
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