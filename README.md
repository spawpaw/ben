# 犇

本项目旨在打造一个基于分布式架构的企业级开发解决方案。  
目前本项目处于设计筹备阶段，暂不对外开放。

## 模块划分

- `cloud-*` `:8***`: 基础
    - `cloud-discovery-eureka` `:8761`: *服务发现：注册中心(eureka)
    - `cloud-monitor-admin` `:8081`: *服务发现：服务监控中心(spring-boot-admin)
    - `cloud-gateway-zuul` `:8080`: *服务网关(zuul)
    - `cloud-config` `:8080`: 分布式配置中心(spring-cloud-config)
- `core-api`: 项目核心依赖。提供常用功能封装、关系对象模型、接口定义等  
- `service-*` `:222**`: 微服务provider，具体描述请看`core-api`模块下的同名接口定义。这里设置不同的端口号仅为了方便单机测试，实际部署时不需要。
    - `service-upms-*` `:2220*`: 用户系统
        - `service-upms-user` `:22201`: 用户服务
        - `service-upms-role` `:22202`: 用户组服务(用户角色)
        - `service-upms-privilege` `:22203`: 用户权限服务
        - `service-upms-user-config` `:22204`: 用户设置服务。用于保存用户的个性化设置
    - `service-cms-*` `:2221*`: 内容管理系统
        - `service-cms-article` `:22210`: 文章服务
        - `service-cms-comment` `:22211`: 文章评论服务
        - `service-cms-category` `:22212`: 文章分类服务
        - `service-cms-tag` `:22213`: 文章标签服务
        - `service-cms-topic` `:22214`: 文章专题服务
    - `service-msg-*` `:2222*`: 消息通知系统
        - `service-msg-notification` `:22220`: 消息通知服务
        - `service-msg-log` `22220`: 日志服务
    - `service-schedule-*` `22230`: 日程系统
    
- `ben-*` `233**`: 前端项目（ServerSideRendering），微服务consumer
    - `ben-sso` `:23301`: 单点登录
- `ben-spa` `:80`: 单页面前端应用，主入口，部署为静态资源

## 开发环境配置
为了在初次开发时，为了避免修改所有模块配置文件的麻烦，请直接按照按照如下要求配置开发环境
### 端口号
在安装如下软件时，请将端口号设定为指定值。  
redis port: 6379

### host
请将如下的记录添加到hosts中，并将ip地址改成您实际使用的ip地址
```hosts
# web
127.0.0.1 dubbo-admin.appx,host
127.0.0.1 sso.appx.host
127.0.0.1 upms.appx.host

#cluster

# redis
127.0.0.1 redis.appx.host

# zookeeper
192.168.78.235 zookeeper.appx.host

# mysql 
127.0.0.1 mysql.appx.host

# eureka 
127.0.0.1 eureka.appx.host

# spring boot admin
127.0.0.1 sba.appx.host

# api gateway
127.0.0.1 api.appx.host
```


### 密码
MysSQL：用户名`root`密码`123456`