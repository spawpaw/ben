# 犇

本项目旨在打造一个基于分布式架构的企业级开发解决方案。  
目前本项目处于设计筹备阶段，暂不对外开放。

## 模块划分
- `core-api`: 项目核心API  
- `dubbo-admin`: dubbo控制台
- `ben-*`: 前端项目，微服务consumer
    - `ben-sso`: 单点登录
    - `ben-upms`: user permission management system，用户权限管理系统
- `provider-*`: 服务provider，具体描述请看`core-api`模块下的同名接口定义。
    - `provider-user-service`: 用户服务
    - `provider-user-group-service`: 用户组服务
    - `provider-user-privilege-service`: 用户权限服务
