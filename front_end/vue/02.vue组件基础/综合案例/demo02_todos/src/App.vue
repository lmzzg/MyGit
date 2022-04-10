<template>
  <h1>App根组件--计划表</h1>
  <!-- 需求分析：1.设计任务列表组件TodoList
                2.设计添加任务到列表里的组件TodoInput，
                3.设计筛选任务的按钮组件TodoButton
       难点：通过props，v-model，自定义事件实现组件之间的数据同步：list与input之间，button与list之间-->
  <hr>
  <!-- 监听 TodoInput 的 add 自定义事件 -->
  <todo-input @add="onAddNewTask"></todo-input>
  
  <todo-list :list="tasklist" class="mt-2"></todo-list>

  
  <!--这种场景下适合使用组件间的 v-model 指令，维护组件间数据的同步 -->
  <!--如何操作： (1)父 -> 子：① 父组件通过 v-bind: 属性绑定的形式，把数据传递给子组件
                            ② 子组件中，通过 props 接收父组件传递过来的数据
                (2)子 -> 父：① 在 v-bind: 指令之前添加 v-model 指令
                            ② 在子组件中声明 emits 自定义事件，格式为 update:xxx
                            ③ 调用 $emit() 触发自定义事件，更新父组件中的数据-->
  <todo-button v-model:active="activeBtnIndex"></todo-button>
</template>

<script>
import TodoList from './components/TodoList.vue'
import TodoInput from './components/TodoInput.vue'
import TodoButton from './components/TodoButton.vue'
export default {
  name:'MyApp',
  data(){
    return{
      todolist:[
        {id:1, task:'周一早晨9点开会', done:false},
        {id:2, task:'周一晚上8点聚餐', done:false},
        {id:3, task:'周四下午进行任务汇报', done:false},
      ],
            
      nextId: 4,// 下一个可用的 Id
      activeBtnIndex: 0,// 声明默认激活项的索引，并通过属性绑定的方式传递给 TodoButton 
    }
  },

//通过计算属性动态切换列表的数据
  computed: {
    // 根据激活按钮的索引值，动态计算要展示的列表数据
    tasklist() {
      // 对“源数据”进行 switch...case 的匹配，并返回“计算之后的结果”
      switch(this.activeBtnIndex) {
        case 0:// 全部
          return this.todolist
        case 1:// 已完成
          return this.todolist.filter(x => x.done === true)
        case 2: // 未完成
          return this.todolist.filter(x => x.done !== true)
      }
    }
  },
    methods: {
      // TodoInput 组件 add 事件的处理函数
    onAddNewTask(taskname) {
      // 1. 向任务列表中新增任务信息
      this.todolist.push({
        id: this.nextId,
        task: taskname,
        done: false,// 完成状态默认为 false
      })

      this.nextId++
    },
  },
  components:{
    TodoList,
    TodoInput,
    TodoButton,
  }
}
</script>

<style lang="less" scoped>

</style>