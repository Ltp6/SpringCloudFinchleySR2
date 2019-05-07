# SpringCloudFinchleySR2
## 1、项目概述
- 使用技术：
  - SpringCloud Finchley.RELEASE
  - SpringCloud Finchley.RELEASE
  - JDK 1.8
## 2、所有技术

- Eureka服务注册与发现
- Ribbon负载均衡
- Feign负载均衡
- zuul网关未实现：
  - 因为SpringCloud Finchley.RELEASE 与 SpringCloud Finchley.RELEASE版本不兼容存在报错：
  ```
  ***************************
  APPLICATION FAILED TO START
  ***************************
  Description:
  The bean 'proxyRequestHelper', defined in class path resource [org/springframework/cloud/netflix/zuul/ZuulProxyAutoConfiguration$NoActuatorConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/zuul/ZuulProxyAutoConfiguration$EndpointConfiguration.class] and overriding is disabled.
  Action:
  Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
  Process finished with exit code 1
  ```
  - 需要使用SpringCloud Greenwich.RC2版本
