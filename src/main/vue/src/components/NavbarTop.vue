<template>
  <div class = "navbar">
      <div class = "navbar-left-container">
            <router-link to="/">
            <span> Hospital Management System </span>
            </router-link>
      </div>
      <div class = "navbar-right-container">
          <ul class = "flex-list-items">
              <router-link to="/about"><li> About Us </li></router-link>
              <router-link to="/dev-contact"><li> Developers Contact </li></router-link>
              <router-link to="/login"><li> Login </li></router-link>
          </ul>
      </div>
  </div>
</template>

<script>
export default {
    name: 'NavbarTop'
}
</script>

<style>
.navbar {
    background: burlywood;
    height: 40px;
    display: flex;
    padding-top: 10px;
}
.navbar-left-container {
    flex: 35%;
    margin-left: 30px;
}
.navbar-right-container {
    flex: 65%;
    margin-right: 30px;
}
.flex-list-items {
    float: right;
    display: flex;
    margin-top: auto;
}
li{
    list-style-type: none;
    margin-left: 2em;
}
</style>