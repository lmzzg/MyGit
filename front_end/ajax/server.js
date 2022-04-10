// 1. 引入express
const express = require('express');

// 2. 创建应用对象
const app = express();

// 3. 创建路由规则
app.get('/server', (request, response) => {
  // 设置响应头 设置允许跨域
  response.setHeader('Access-Control-Allow-Origin', '*');
  // 设置响应体
  response.send("Hello Ajax");
});

app.post('/server', (request, response) => {
    // 设置响应头, 设置允许跨域
    response.setHeader('Access-Control-Allow-Origin', '*');
    // 设置响应体
    response.send("Hello Ajax POST");
  });
  

  app.all('/json-server', (request, response) => {
    // 设置响应头, 设置允许跨域
    response.setHeader('Access-Control-Allow-Origin', '*');
    // 设置响应头, 设置允许自定义头信息
    response.setHeader('Access-Control-Allow-Headers', '*');
    // 响应一个数据
    const data = {
      name: 'atguigu'
    };
    // 对 对象 进行 字符串 转换
    let str = JSON.stringify(data)
    // 设置响应体 
    response.send(str);
  });
  
// 4. 监听服务
app.listen(8000, () => {
  console.log("服务已经启动, 8000 端口监听中...");
 })
