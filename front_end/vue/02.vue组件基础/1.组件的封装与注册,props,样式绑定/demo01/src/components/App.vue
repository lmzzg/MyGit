<template>
  <div class="app-container">
    <h1>App根组件</h1>

    <hr>

    <my-header title="黑马程序员" bgcolor="#000" color="#fff"></my-header>
  </div>
</template>

<script>
import MyHeader from './06.DemoMyHeader/MyHeader.vue'

export default {
  name: 'MyApp',
  components: {
    MyHeader,
  },
}
</script>

<style lang="css" scoped>
.app-container {
  margin-top: 45px;
}
</style>
