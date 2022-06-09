<template>
  <NavbarTop/>
  <router-view/>
</template>

<script>
import NavbarTop from './components/NavbarTop.vue'


export default {
  name: 'App',
  components: {
    NavbarTop
  }
}
</script>

<style>
</style>
