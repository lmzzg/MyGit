<template>
  <div class="counter-container">
    <!-- 数量 -1 按钮 -->
    <button type="button" class="btn btn-light btn-sm" @click="onSubClick">-</button>
    <!-- 输入框 -->
    <!-- 不能直接把 props里的num 通过 v-model 指令双向绑定到 input 输入框，因为 vue规定props 的值只读的！应该绑定data里的number -->
    <input type="number" class="form-control form-control-sm ipt-num" v-model.number.lazy="number" />
    <!-- 数量 +1 按钮 -->
    <button type="button" class="btn btn-light btn-sm" @click="onAddClick">+</button>
  </div>
</template>

<script>
export default {
  name: 'EsCounter',
  props: {// props 的值只读的，所以初始数量值为只读数据
    num: {
      type: Number,
      default: 0,
    },
    min: {
      type: Number,
      default: NaN,
    },
  },
  data() {
    return {
      number: this.num,// 内部状态值【可读可写的数据】,通过 this 可以访问到 props 中的初始值
    }
  },
  emits: ['numChange'],

  // 通过 watch 侦听器监听 number 数值的变化，并转换
  watch: {
    number(newVal) {
      // 1. 将输入的新值转化为整数
      const parseResult = parseInt(newVal)
      // 2. 如果转换的结果不是数字，或小于1，则强制 number 的值等于1
      if (isNaN(parseResult) || parseResult < 1) {
        this.number = 1
        return
      }
      // 3. 如果新值为小数，则把转换的结果赋值给 number
      if (String(newVal).indexOf('.') !== -1) {
        this.number = parseResult
        return
      }

      // 触发自定义事件，把最新的 number 数值传递给组件的使用者
      this.$emit('numChange', this.number)
    },
  },

  
  methods: {
    // -1 按钮的事件处理函数
    onSubClick() {
      // 判断条件：min 的值存在，且 number - 1 之后小于 min
      if (!isNaN(this.min) && this.number - 1 < this.min) return
      this.number--
    },
    // +1 按钮的事件处理函数
    onAddClick() {
      this.number++
    },
  },
}
</script>

<style lang="less" scoped>
.counter-container {
  display: flex;
  // 按钮的样式
  .btn {
    width: 25px;
  }
  // 输入框的样式
  .ipt-num {
    width: 34px;
    text-align: center;
    margin: 0 4px;
  }
}
</style>
