<template>
    <h3>标题：{{title}}</h3>
    <h5>作者:{{author}}</h5>
    <h6>发布时间:{{pubTime}}</h6>
</template>

<script>
export default {
    name:'MyArticle',
    //父组件通过 props 向子组件传递要展示的数据
    props:['title','author','pubTime']
}
</script>