# Summary

* [内容简介](docs/Introduction.md)
* [前言](docs/Preface.md)
* [第1章 Spring Boot 概述](docs/ch1/1.md)
    * [1.1 传统企业级应用开发之痛与革新](docs/ch1/1-1.md)
		* Java 大事件
		* Java 企业级应用现状
		* 革新
		* 约定大于配置
    * [1.2 Spirng Boot 2总览](docs/ch1/1-2.md)
		* 解决传统 Spring 开发过程中的痛点
		* Spring Boot 的目标
		* Spring Boot 不是什么
		* Spirng Boot 2 新特性
    * [1.3 快速开启第一个 Spirng Boot 项目](docs/ch1/1-3.md)
		* 配置环境
		* 通过 Spring Initializr 初始化一个 Spring Boot 原型
		* 用 Gradle 编译项目
		* 探索项目
		* 如果提升 Gradle 的构建速度
		* 示例源码
    * [1.4 如何进行 Spring Boot 项目的开发及测试](docs/ch1/1-4.md)
		* 编写项目构建信息
		* 编写程序代码
		* 编写测试用例
		* 配置 Gradle Wrapper
		* 运行程序
		* 其他运行程序的方式
		* 如何将项目导入 IDE
		* 示例源码
* [第2章 Spring 框架核心概念](docs/ch2/2.md)
    * [2.1 Spring 框架总览](docs/ch2/2-1.md)
		* 模块化的 Spring 框架
		* 使用 Spring 的好处
		* 依赖注入 VS. 控制反转
		* Spring 框架常用模块
    * [2.2 依赖注入与控制反转](docs/ch2/2-2.md)
		* IoC 容器和 bean
		* 配置元数据
		* 实例化容器
		* 两种注入方式
		* bean 范围
		* 注意 singleton bean 引用 prototype bean 时的陷阱
		* JSR-330 规范注解
		* Spring Boot 中的 bean 及依赖注入
    * [2.3 AOP 编程](docs/ch2/2-3.md)
		* AOP 核心概念
		* Spring AOP 功能和目标
		* AOP 代理
		* 使用 @AspectJ
		* 示例
* [第3章 Spring MVC 及常用 MediaType](docs/ch3/3.md)
    * [3.1 Spring MVC 简介](docs/ch3/3-1.md)
		* MVC 是三层架构吗
		* Spring MVC 中的自动配置
    * [3.2 JSON 类型的处理](docs/ch3/3-2.md)
		* 控制器及实体
		* 返回 JSON 类型 
		* Web API 常用调试方式
		* 示例源码
    * [3.3 XML 类型的处理](docs/ch3/3-3.md)
		* 返回 XML 类型
		* 第三方 XML 框架
		* 示例源码
    * [3.4 文件上传的处理](docs/ch3/3-4.md)
		* MultipartResolver
		* 通过 Form 表单来上传文件的例子
		* RESTful API 的文件上传
		* 完整示例
* [第4章 集成 Thymeleaf](docs/ch4/4.md)
    * [4.1 常用Java 模板引擎](docs/ch4/4-1.md)
		* 关于性能
		* 为什么选择 Thymeleaf 而不是 JSP
		* 什么是 Thymeleaf
		* Thymeleaf 处理模版
		* 标准方言
    * [4.2 Thymeleaf 标准方言](docs/ch4/4-2.md)
		* Thymeleaf 标准表达式语法
		* 消息表达式（Message (i18n) expressions）
		* 变量表达式（Variable expressions）
		* 表达式基本对象（Expression Basic Objects）
		* 表达式工具对象（Expression Utility Objects）
		* 选择表达式（Selection expressions）
		* 链接表达式（Link (URL) expressions）
		* 分段表达式（Fragment expressions）
		* 字面量（Literals）
		* 比较与相等
		* 条件表达式
		* 默认表达式（Elvis operator）
		* 无操作标记
		* 数据转换及格式化
		* 表达式预处理
    * [4.3 Thymeleaf 设置属性值](docs/ch4/4-3.md)
		* 设置任意属性值
		* 设置值到指定的属性
		* 同时设置多个值
		* 附加和添加前缀
		* 固定值布尔属性
		* 默认属性处理器
		* 支持对 HTML5 友好的属性及元素名称
    * [4.4 Thymeleaf 迭代器与条件语句](docs/ch4/4-4.md)
		* 迭代器
		* 条件语句
    * [4.5 Thymeleaf 模板片段](docs/ch4/4-5.md)
		* 定义和引用片段
		* Thymeleaf 片段规范语法
		* 不使用 `th:fragment`
		* `th:insert`、 `th:replace` 、`th:include`三者区别
    * [4.6 Thymeleaf 表达式基本对象](docs/ch4/4-6.md)
		* 基本对象
		* Web 上下文命名空间用于 request/session 属性等
		* Web 上下文对象
    * [4.7 Thymeleaf 与 Spring Boot 集成](docs/ch4/4-7.md)
		* 所需环境
		* build.gradle
		* 如何自定义版本
    * [4.8 Thymeleaf 实战](docs/ch4/4-8.md)
		* 修改 application.propertiess
		* 后台编码
		* 编写前台页面
		* 运行
		* 示例源码
* [第5章 数据持久化](docs/ch5/5.md)
    * [5.1 JPA 概述](docs/ch5/5-1.md)
		* JPA 的产生背景
		* 实体（Entity）
		* 实体中的主键
		* 实体间的关系
		* 实体中的可嵌入类
		* 实体继承
		* 管理实体
		* 查询实体
		* 数据库模式创建
    * [5.2 Spring Data JPA](docs/ch5/5-2.md)
		* Spring Data 是什么
		* Spring Data JPA 特性
		* 如何使用 Spring Data JPA
		* 核心概念
		* 查询方法
		* 定义资源库的接口
		* 定义查询方法
		* 创建资源实例
    * [5.3 Spring Data JPA 与 Hibernate、Spring Boot 集成](docs/ch5/5-3.md)
		* 所需环境
		* build.gradle
		* 集成 H2
		* MySQL 安装及使用
    * [5.4 数据持久化实战](docs/ch5/5-4.md)
		* 定义实体
		* 修改资源库
		* 修改控制器
		* 查看 H2 表结构
		* 使用 MySQL 数据库
		* 运行查看效果
		* 相关错误解决
		* 示例源码
* [第6章 全文搜索](docs/ch6/6.md)
    * [6.1 全文搜索概述](docs/ch6/6-1.md)
		* 数据结构
		* 数据搜索的方式
		* 全文搜索的原理
		* 全文搜索相关的技术
    * [6.2 Elasticsearch 核心概念](docs/ch6/6-2.md)
		* 基于 Lucene
		* 如何查看 Elasticsearch 对应的 Lucence 版本
		* 近实时（NRT）
		* 集群（Cluster）
		* 节点
		* 索引（Index）
		* 类型（Type）
		* 文档（Document）
		* 分片和副本（Shards & Replicas）
		* 使用场景
    * [6.3 Elasticsearch 与 Spring Boot 集成](docs/ch6/6-3.md)
		* 环境
		* build.gradle
		* 下载安装 Elasticsearch
		* 运行与停止服务
		* 配置
		* 确认运行情况
		* 作为 Windows 服务
    * [6.4 Elasticsearch 实战](docs/ch6/6-4.md)
		* 启动  Elasticsearch
		* 修改application.properties
		* 创建文档类
		* 创建资源库
		* 创建资源库测试用例
		* 创建控制器
		* 运行
		* 示例源码
* [第7章 架构设计与分层](docs/ch7/7.md)
    * [7.1 为什么需要分层](docs/ch7/7-1.md)
		* 应用的分层
		* 不分层的应用架构
		* 应用的三层架构
    * [7.2 系统的架构设计及职责划分](docs/ch7/7-2.md)
		* 博客系统的三层架构
		* 博客系统的架构设计
* [第8章 集成 Bootstrap](docs/ch8/8.md)
    * [8.1 Bootstrap 简介](docs/ch8/8-1.md)
		* HTML5 doctype
		* 响应式 meta 标签
		* Box-sizing
		* Normalize.css
		* 模版
    * [8.2 Bootstrap 核心概念](docs/ch8/8-2.md)
		* Bootstrap 的网格系统（Grid System）
		* 媒体查询（Media Query）
		* 网格选项
		* 实例：移动设备及桌面设备
    * [8.3 Bootstrap 及常用前端框架与 Spring Boot 集成](docs/ch8/8-3.md)
		* 所需环境
		* 将 Bootstrap 与 jQuery 集成进项目
		* 其他前端常用控件的集成
    * [8.4 Bootstrap 实战](docs/ch8/8-4.md)
		* 修改页眉 header.html
		* 修改页脚 footer.html
		* 修改 list.html
		* 修改 form.html
		* 修改 view.html
		* 运行
		* 示例源码
* [第9章 博客系统的需要分析与设计](docs/ch9/9.md)
    * [9.1 博客系统的需要分析](docs/ch9/9-1.md)
		* 如何获得系统的需求
		* 博客系统的整体功能需求
		* 用户管理
		* 安全设置
		* 博客管理
		* 评论管理
		* 点赞管理
		* 分类管理
		* 标签管理
		* 首页搜索
    * [9.2 博客系统的原型设计](docs/ch9/9-2.md)
		* 原型设计的重要性
		* 博客系统的原型设计
* [第10章 集成 Spring Security](docs/ch10/10.md)
    * [10.1 基于角色的权限管理](docs/ch10/10-1.md)
		* 什么是角色
		* 基于角色的访问控制
		* 哪种方式更好
		* 真实的案例
    * [10.2 Spring Security 概述](docs/ch10/10-2.md)
		* Spring Security 的认证模型
		* Spring Security 的安装
		* 模块
		* Spring Security 5 新特性及高级功能
    * [10.3 Spring Security 与 Spring Boot 集成](docs/ch10/10-3.md)
		* 所需环境
		* build.gradle
    * [10.4 Spring Security 实战](docs/ch10/10-4.md)
		* 后台代码
		* 前端代码
		* 运行
		* 相关问题解决
* [第11章 博客系统的整体框架实现](docs/ch11/11.md)
    * [11.1 如何设计 API](docs/ch11/11-1.md)
		* 什么是 REST 
		* REST 设计原则
		* Java REST
		* 常用 REST 框架
		* 博客系统的 API
    * [11.2 实现后台整体控制层](docs/ch11/11-2.md)
		* MainController
		* BlogController
		* UserspaceController
		* AdminController
		* UserController
    * [11.3 实现前台整体布局](docs/ch11/11-3.md)
		* 登录界面
		* 注册界面
		* 页首
		* 分页组件
		* 文章列表
		* 示例源码
* [第12章 用户管理实现](docs/ch12/12.md)
    * [12.1 用户管理的需求回顾](docs/ch12/12-1.md)
		* 所需环境
		* build.gradle
		* 用户管理的需求
		* API
    * [12.2 用户管理的后台实现](docs/ch12/12-2.md)
		* 修改 User
		* 修改 UserRepository 
		* 新增 UserService 接口及实现
		* 增加 Response
		* 增加 ConstraintViolationExceptionHandler
		* 修改 UserController
		* 增加 Menu
		* 修改 AdminController
		* 修改 MainController
		* 问题解决
    * [12.3 用户管理的前台实现](docs/ch12/12-3.md)
		* 用户注册
		* 后台管理
		* 用户管理
		* 分页组件
		* 问题解决
		* 示例源码
* [第13章 角色管理实现](docs/ch13/13.md)
    * [13.1 角色管理的需求回顾](docs/ch13/13-1.md)
		* 所需环境
		* build.gradle
		* 角色管理的需求
    * [13.2 角色管理的后台实现](docs/ch13/13-2.md)
		* 创建 Authority
		* 修改  User 
		* 新增 AuthorityRepository
		* 新增 AuthorityService 接口及实现
		* 修改 UserController
		* 修改 MainController
		* 安全配置类
    * [13.3 角色管理的前台实现](docs/ch13/13-3.md)
		* 用户管理
		* 初始化数据
		* 运行
		* 示例源码
* [第14章 权限管理实现](docs/ch14/14.md)
    * [14.1 权限管理的需求回顾](docs/ch14/14-1.md)
		* 权限管理的需求
		* API 设计
    * [14.2 权限管理的后台实现](docs/ch14/14-2.md)
		* 修改  SecurityConfig
		* UserDetailsService 接口的实现
    * [14.3 CSRF 防护处理](docs/ch14/14-3.md)
    * [14.4 权限管理的前台实现](docs/ch14/14-4.md)
		* 用户登录
		* 初始化数据
		* 运行
		* 示例源码
* [第15章 文件服务器实现](docs/ch15/15.md)
    * [15.1 文件服务器的需求分析](docs/ch15/15-1.md)
		* 文件服务器的需求
		* API 
    * [15.2 MongoDB 简介](docs/ch15/15-2.md)
	   * MongoDB 特点
	   * MongoDB 核心概念
    * [15.3 MongoDB 与 Spring Boot 集成](docs/ch15/15-3.md)
	   * 所需环境
	   * build.gradle
    * [15.4 文件服务器的实现](docs/ch15/15-4.md)
	   * 领域对象
	   * 控制层、API 资源层
	   * 运行
	   * 其他配置项
	   * 问题解决
	   * 源码
* [第16章 博客管理实现](docs/ch16/16.md)
    * [16.1 博客管理的需求回顾](docs/ch16/16-1.md)
	   * 所需环境
	   * build.gradle
	   * 权限管理的需求
	   * API 设计
    * [16.2 实现个人设置、头像变更](docs/ch16/16-2.md)
	   * 个人设置
	   * 更改头像
	   * 与文件服务器通信
    * [16.3 博客管理的后台实现](docs/ch16/16-3.md)
	   * 博客模型的设计
	   * 仓库接口
	   * 服务接口及实现
	   * 控制层
    * [16.4 博客管理的前台实现](docs/ch16/16-4.md)
	   * 用户主页实现
	   * 博客展示
	   * 博客编辑
	   * 运行
	   * 示例源码
* [第17章 评论管理实现](docs/ch17/17.md)
    * [17.1 评论管理的需求回顾](docs/ch17/17-1.md)
	   * 评论管理的需求
	   * API 设计
    * [17.2 评论管理的后台实现](docs/ch17/17-2.md)
	   * 评论的模型设计
	   * 评论的仓库
	   * 评论的服务接口及实现
	   * 控制层
    * [17.3 评论管理的前台实现](docs/ch17/17-3.md)
	   * 修改  blog.html
	   * 修改 blog.js
	   * 运行
	   * 示例源码
* [第18章 点赞管理实现](docs/ch18/18.md)
    * [18.1 点赞管理的需求回顾](docs/ch18/18-1.md)
	   * 点赞管理的需求
	   * API 设计
    * [18.2 点赞管理的后台实现](docs/ch18/18-2.md)
	   * 点赞的模型设计
	   * 点赞的仓库
	   * 点赞的服务接口及实现
	   * 控制层
    * [18.3 点赞管理的前台实现](docs/ch18/18-3.md)
	   * 修改  blog.html
	   * 修改 blog.js
	   * 运行
	   * 示例源码
* [第19章 分类管理实现](docs/ch19/19.md)
    * [19.1 分类管理的需求回顾](docs/ch19/19-1.md)
	   * 分类管理的需求
	   * API 设计
    * [19.2 分类管理的后台实现](docs/ch19/19-2.md)
	   * 分类的模型设计
	   * 分类的仓库
	   * 分类的服务接口及实现
	   * 控制层
    * [19.3 分类管理的前台实现](docs/ch19/19-3.md)
	   * 修改  u.html
	   * 修改 blogedit.html
	   * 修改 blog.html
	   * 新增 catalogedit.html
	   * 修改 u.js
	   * 运行
	   * 示例源码
* [第20章 标签管理实现](docs/ch20/20.md)
    * [20.1 标签管理的需求回顾](docs/ch20/20-1.md)
	   * 所需环境
	   * 标签管理的需求
    * [20.2 标签管理的后台实现](docs/ch20/20-2.md)
	   * 标签的模型设计
	   * 修改 UserspaceController
    * [20.3 标签管理的前台实现](docs/ch20/20-3.md)
	   * 修改 blog.html
	   * 修改 blogedit.js
	   * 运行
	   * 示例源码
* [第21章 首页搜索实现](docs/ch21/21.md)
    * [21.1 首页搜索的需求回顾](docs/ch21/21-1.md)
	   * 环境
	   * build.gradle
	   * 修改 application.properties
	   * 实现功能
	   * API 设计
    * [21.2 首页搜索的后台实现](docs/ch21/21-2.md)
	   * 创建文档
	   * 创建资源库
	   * 创建 Tag 的值对象
	   * 创建服务接口及实现
	   * 修改控制器
    * [21.3 首页搜索的前台实现](docs/ch21/21-3.md)
	   * 修改 index.html
	   * 修改  header.html
	   * 增加 index.js
	   * 运行
	   * 示例源码
    * [21.4 使用中文分词](docs/ch21/21-4.md)
	   * IK Analysis 插件
	   * 安装 IK Analysis 
	   * 使用 IK Analysis
	   * IK Analysis 类型
* [第22章 总结与展望](docs/ch22/22.md)
    * [22.1 Spring Boot 企业级应用开发的总结](docs/ch22/22-1.md)
	   * 了解企业级开发的完整流程
	   * 熟悉当前主流、前瞻的技术框架及其应用
	   * 理论联系实战，其然知其所以然也
    * [22.2 博客系统的展望](docs/ch22/22-2.md)
	   * 多看，多思考，多敲代码，多实践
	   * 善于总结，举一反三
	   * 大胆质疑，多交流
* [附录A：开发环境的搭建](docs/appendices/appendices-a.md)
* [附录B：Thymeleaf 属性](docs/appendices/appendices-b.md)
* [附录C：Thymeleaf 表达式工具对象](docs/appendices/appendices-c.md)
* [附录D：Bean Validation 内置约束](docs/appendices/appendices-d.md)
* [附录E：本书所涉及到的技术及相关版本](docs/appendices/appendices-e.md)
* [参考资料](docs/references.md)

 
