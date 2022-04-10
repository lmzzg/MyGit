<template>
<!-- 动态为 DOM 元素绑定行内的 style 样式对象 -->
  <div class="header-container" :style="{ backgroundColor: bgcolor, color: color, fontSize: fsize + 'px' }">{{ title }}</div>
</template>

<script>
export default {
  name: 'EsHeader',
  props: {
    title: {
      type: String,
      default: 'es-header',
    },
    bgcolor: {
      type: String,
      default: '#007BFF',
    },
    color: {// 文字颜色
      type: String,
      default: '#ffffff',
    },
    fsize: {//文字大小
      type: Number,
      default: 12,
    },
  },
}
</script>

<style lang="less" scoped>
.header-container {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 45px;
  text-align: center;
  line-height: 45px;
  z-index: 999;
}
</style>
