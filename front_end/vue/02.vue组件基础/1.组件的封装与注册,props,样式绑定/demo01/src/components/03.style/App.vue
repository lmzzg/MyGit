<template>
<h3 title="title">这是测试样式冲突的组件</h3>
  <p>这是App.vue里的p标签</p>
  <hr />
  <my-list></my-list>
</template>
<script>
import MyList from "./List.vue";
export default {
  name: "MyStyle",
  components: {
    MyList,
  },
};
</script>


<style lang='css' scoped>
/* 样式冲突：① 单页面应用程序中，所有组件的 DOM 结构，都是基于唯一的 index.html 页面进行呈现的
            ② 每个组件中的样式，都会影响整个 index.html 页面中的 DOM 元素 */
p{
    color:red
}
/* 
vue2.x使用/deep/设置样式穿透，3.x使用：deep（）
/deep/ .title {
color: blue;
} */

/* 样式穿透：如果给当前组件的 style 节点添加了 scoped 属性，则当前组件的样式对其子组件是不生效的 */
:deep(.title) {
  color: blue;
}
</style>