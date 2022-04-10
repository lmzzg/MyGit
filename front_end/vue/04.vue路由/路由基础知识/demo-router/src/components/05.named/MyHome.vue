<template>
  <div>
    <h3>MyHome 组件</h3>
    <!-- 命名路由实现声明式导航 -->
    <router-link :to="{ name: 'mov', params: { mid: 2 } }">go to movie</router-link>
    <!-- 使用命名路由实现编程式导航 -->
    <button type="button" class="btn btn-primary" @click="goToMovie(1)">go to movie</button>
  </div>
</template>

<script>
export default {
  name: 'MyHome',
  methods: {
    goToMovie(id) {
      this.$router.push({
        name: 'mov',       //name 值不能重复，必须保证唯一性
        params: {
          mid: id,
        },
      })
    },
  },
}
</script>

<style lang="less" scoped></style>
