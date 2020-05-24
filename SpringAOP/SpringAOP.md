# Spring AOP
## 什么是AOP？
与OOP对比，AOP是处理一些横切行问题。这些横切性问题不会影响到主逻辑的实现，但是会散落到代码的各个部分，难以维护。AOP就是把这些问题和主业务逻辑分开，达到与主业务逻辑解耦的目的。
传统OOP是自上而下的逻辑开发；

传统OOP: Browse-通过http/https-->servlet/controller--调用service-->Service--调用dao-->dao datebase

AOP是一种面向切面的编程思想。这些横切性问题，把它们抽象为一个切面，关注点在切面的编程，这就是所谓的AOP。

导入依赖：
```xml
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.4</version>
</dependency>
```

### 方式一：使用Spring API接口【主要是Spring API接口实现】

### 方式二：自定义类来实现【主要是切面定义】

### 方式三：使用注解来实现

