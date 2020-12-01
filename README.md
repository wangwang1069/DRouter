## 简单介绍

- Android路由框架，基于平台化解耦的思想，服务于组件化间通信
- 以功能全面、易用为原则，支持各种路由场景
- 在Router、RouterHandler、Page、Service、Remote等场景提供多样化的服务
- 像调用本地方法一样进行跨进程访问
- 框架内部尽可能减少使用反射，提升性能

## 提供功能

- 使用URI字符串导航Activity、Fragment、View、RouterHandler，支持正则表达式
- 回调式onActivityResult
- RouterHandler、Activity支持等待异步完成(hold)，并可设置超时时间
- RouterHandler指定执行线程
- 注入拦截器，支持全局拦截器和局部拦截器，面向切面编程
- 更为多样化的Fragment页面跳转能力
- 使用接口或基类导航到实现类Service的Class以及实例
- 支持Service别名以及多维过滤器查找
- 导航Service可指定任意构造器、支持单例
- 支持动态注册RouterHandler、Service，绑定生命周期自动解绑
- 简单易用的跨进程执行RouterHandler、Service
- 跨进程访问无需提前绑定、如同本地调用一样进行访问
- 支持客户端进程和服务端进程自动重连
- 支持VirtualApk
- 无需手动添加混淆规则
- 编译期插件支持增量扫描，运行时加载路由表效率高
- 动态下载与api匹配的plugin，无需升级plugin版本

## 核心模块

模块 | 支持功能
|  :-- | :--  |
Router | Native和H5导航Activity、Fragment、View、RouterHandler，支持切入拦截器
Service | 基于spi通过接口的形式查找到实现类，支持过滤和优先级配置
Remote | 跨进程访问Router、Service
Page | 支持单Page、栈Page、ViewPager三种形式的Fragment加载

## 使用文档

API文档请移步 [WIKI](https://github.com/didi/DRouter/wiki)

## QQ交流群

<img src="https://github.com/didi/DRouter/blob/master/img/qq_group.png" width="200px" align="center" alt="DRouter官方交流群"/>

## License

VirtualAPK is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file.
