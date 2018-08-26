# 犇

本项目旨在打造一个基于分布式架构的企业级开发解决方案。  
目前本项目处于设计筹备阶段，暂不对外开放。

## 模块划分
- `core-api`: 项目核心API  
- `dubbo-admin` `:7001`: dubbo控制台
- `ben-*` `233**`: 前端项目，微服务consumer
    - `ben-sso` `:23301`: 单点登录
    - `ben-upms` `:23302`: user permission management system，用户权限管理系统
    - `ben-rest-api` `:23303`: 供外部HTTP调用的REST风格的API
- `provider-*` `:222**`: 微服务provider，具体描述请看`core-api`模块下的同名接口定义。
    - `provider-user-service` `:22201`: 用户服务
    - `provider-user-group-service` `:22202`: 用户组服务(用户角色)
    - `provider-user-privilege-service` `:22203`: 用户权限服务

## 开发环境配置
为了在初次开发时，为了避免修改所有模块配置文件的麻烦，请直接按照按照如下要求配置开发环境
### 端口号
在安装如下软件时，请将端口号设定为指定值。  
zookeeper port: 2181  
redis port: 6379

### host
请将如下的记录添加到hosts中，并将ip地址改成您实际使用的ip地址
```hosts
# web
127.0.0.1 dubbo-admin.appx,host
127.0.0.1 sso.appx.host
127.0.0.1 upms.appx.host
127.0.0.1 api.appx.host

#cluster
127.0.0.1 redis.appx.host
192.168.78.10 zookeeper.appx.host
127.0.0.1 mysql.appx.host
```


### 密码
MysSQL：用户名`root`密码`123456`
dubbo-admin：默认用户名为`root`,默认密码为`root`