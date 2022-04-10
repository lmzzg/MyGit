<template>
  <div class="goods-container">
    <!-- 左侧图片区域 -->
    <div class="left">
      <div class="custom-control custom-checkbox">
        <!-- 渲染各个商品复选框时动态绑定商品id到 input 的 id 属性和 label 的 for 属性，防止选错 -->
        <input type="checkbox" class="custom-control-input" :id="id" :checked="checked" @change="onCheckBoxChange" />
        <label class="custom-control-label" :for="id">
          <!-- 商品的缩略图 -->
          <img :src="thumb" alt="商品图片" class="thumb" />
        </label>
      </div>
    </div>

    <!-- 右侧信息区域 -->
    <div class="right">
      <!-- 商品名称 -->
      <div class="top">{{ title }}</div>
      <div class="bottom">
        <!-- 商品价格 -->
        <div class="price">￥{{ price.toFixed(2) }}</div>
        <!-- 商品数量 -->
        <div class="count">
          <!-- 使用escounter子组件，动态绑定商品数量，指定数量的最小值为 1 ，绑定自定义的转换数字事件-->
          <es-counter :num="count" :min="1" @numChange="getNumber"></es-counter>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import EsCounter from '../es-counter/EsCounter.vue'

export default {
  name: 'EsGoods',
  props: {
    // 商品的 id
    id: {
      type: [String, Number],//id 的值可以是“字符串”也可以是数值
      required: true,
    },
    // 商品的缩略图
    thumb: {
      type: String,
      required: true,
    },
    // 商品的名称
    title: {
      type: String,
      required: true,
    },
    // 单价
    price: {
      type: Number,
      required: true,
    },
    // 数量
    count: {
      type: Number,
      required: true,
    },
    // 勾选的状态
    checked: {
      type: Boolean,
      required: true,
    },
  },
// 通过自定义事件的方式传递各个商品的勾选状态和数量给父组件。
  emits: ['stateChange', 'countChange'],
 
 methods: {
  //  监听商品复选框选中状态变化的事件处理函数
    onCheckBoxChange(e) {
      // console.log(e.target.checked)
      this.$emit('stateChange', {
        id: this.id,
        value: e.target.checked,//向外发送的数据是一个对象，包含了 { id, value } 两个属性，
      })
    },

    // 监听商品数量值的变化的事件处理函数
    getNumber(num) {
      // console.log(num)
      this.$emit('countChange', {
        id: this.id,
        value: num
      })
    },
  },

  components: {
    EsCounter,//组件嵌套
  },
}
</script>

<style lang="less" scoped>
.goods-container {
  + .goods-container {
    border-top: 1px solid #efefef;
  }
  display: flex;
  padding: 10px;
  // 左侧图片的样式
  .left {
    margin-right: 10px;
    // 商品图片
    .thumb {
      display: block;
      width: 100px;
      height: 100px;
      background-color: #efefef;
    }
  }
  // 右侧商品名称、单价、数量的样式
  .right {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    flex: 1;
    .top {
      font-weight: bold;
    }
    .bottom {
      display: flex;
      justify-content: space-between;
      align-items: center;
      .price {
        color: red;
        font-weight: bold;
      }
    }
  }
}

.custom-control-label::before,
.custom-control-label::after {
  top: 3.4rem;
}
</style>
