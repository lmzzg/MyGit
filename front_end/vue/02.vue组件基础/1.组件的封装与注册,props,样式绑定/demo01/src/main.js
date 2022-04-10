// 1. 按需导入 createApp 函数
import { createApp } from 'vue'
// 2. 导入待渲染的 App.vue 组件
// import App from './App.vue'
// import App from './components/03.style/App.vue'
// import App from './components/04.props/App.vue'
// import App from './components/05.Style&Class/App.vue'
import App from './components/App.vue'
import './index.css'

//全局注册组件
//导入需要被全局注册的组件
import Swiper from './components/01.globalReg/Swiper.vue'
import Test from './components/01.globalReg/Test.vue'


// 3. 调用 createApp 函数，创建 SPA 应用的实例
const app = createApp(App)
// createApp(App).mount('#app')//不用全局注册组件时的快速写法


//4.调用 app.component() 方法全局注册组件
app.component(Swiper.name,Swiper)//或者app.component('MySwiper',Swiper)
app.component(Test.name,Test)

// 5. 调用 mount() 把 App 组件的模板结构，渲染到指定的 el 区域中
app.mount('#app')