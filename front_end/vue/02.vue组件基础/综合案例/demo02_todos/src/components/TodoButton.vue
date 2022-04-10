<template>
  <div class="mt-3 btn-container">
    <div class="btn-group" role="group" aria-label="Basic example">
      <!-- 通过 动态绑定 class 类名 的方式控制按钮的激活状态 -->
      <button
        type="button"
        class="btn"
        :class="active === 0 ? 'btn-primary' : 'btn-secondary'"
        @click="onBtnClick(0)"
      >
        全部
      </button>
      <button
        type="button"
        class="btn"
        :class="active === 1 ? 'btn-primary' : 'btn-secondary'"
        @click="onBtnClick(1)"
      >
        已完成
      </button>
      <button
        type="button"
        class="btn"
        :class="active === 2 ? 'btn-primary' : 'btn-secondary'"
        @click="onBtnClick(2)"
      >
        未完成
      </button>
    </div>
  </div>
</template>

<script>
export default {
  name: "TodoButton",
  //声明如下的自定义事件，用来更新父组件传递过来的 props 数据
  emits: ["update:active"],

  props: {
    // 通过 props 指定默认激活的按钮
    active: {
      // 激活项的索引值
      type: Number,
      required: true,
      default: 0, // 默认激活索引值为 0 的按钮（全部：0，已完成：1，未完成：2）
    },
  },
  methods: {
    onBtnClick(index) {
      // 1. 如果当前点击的按钮的索引值，等于 props 传递过来的索引值，则没必要触发 update:active 自定义事件
      if (index === this.active) return;
      // 2. 通过 this.$emit() 方法触发自定义事件
      this.$emit("update:active", index);
    },
  },
};
</script>

<style lang="less" scoped>
.btn-container {
  width: 400px;
  text-align: center;
}
</style>