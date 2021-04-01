# spring 不同环境配置

- 线上：完全上线的环境
- 预发：线上的数据库，允许测试验证的环境
- 测试：用于测试开发的环境


## spring 配置生效
spring.profiles.active=online

代表online环境生效，会使用application-online.properties的配置


无论哪个环境，application.properties都生效。

## 部署
java -jar spring-profile-demo.jar --spring.profiles.active=online

# spring ioc
[Spring的IoC原理](https://blog.csdn.net/csdn_life18/article/details/105157661)
[Spring Boot AOP简单实现](https://blog.csdn.net/d528071941/article/details/106526722)