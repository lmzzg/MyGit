<template>
    <h1>这是App.vue根组件</h1>
    <hr>
    <my-article :title="info.title" :author="info.author" :pub-time="info.pubTime"></my-article>
</template>

<script>

import MyArticle from './Article.vue'

export default {
    name:'MyApp',
    data(){
        return{
            info:{
                title:'abc',
                author:'123',
                pubTime:'1989',
            }
        }
    },
    components:{
        MyArticle,
    },
}
</script>