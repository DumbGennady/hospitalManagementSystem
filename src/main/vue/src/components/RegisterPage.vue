<template>
  <div>
      <div>
            User Register
      </div>
      <div class = "login-container">
          <div class="login-item">
            Admin Register
          </div>
          <div class="login-item">
            Doctor Register
          </div>
          <div class="login-item">
            Receptionist Register
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