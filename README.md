## 秒杀系统（来源乐字节）

### 主要技术
- 前端：Thymeleaf、Bootstrap、jQuery
- 后端：SpringBoot、Mybatis-plus、MySQL
- 中间件：Redis、RabbitMQ
- 接口管理：Knife4j

### 安装与运行
1. 新建一个文件夹
2. 进入文件夹，打开GitBash，输入：
```
git clone https://github.com/codeMyLife830/lili_seckill.git
```
3. 运行idea，选择File > open选项，选中克隆到本地的项目文件夹
4. 刷新Maven，导入相关依赖
5. 修改项目文件夹中application.yml的数据库、Redis、RabbitMQ相关配置
6. 完成上述步骤后，即可运行
   - 秒杀系统请访问：http://localhost:8080/login/toLogin
   - 接口文档请访问：http://localhost:8080/doc.html
