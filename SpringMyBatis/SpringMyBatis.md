# Spring MyBatis

- 环境配置
```xml
<dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.46</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.0</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.0.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.2.0.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.8.10</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>2.0.2</version>
    </dependency>
</dependencies>
<build>
    <resources>
        <!-- 由于想将Mapper.xml文件和Mapper接口放在一起，
                 故将src/main/java添加到资源搜索目录  -->
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>false</filtering>
        </resource>
        <!-- 原有的src/main/resources也要添加到资源搜索目录 -->
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>false</filtering>
        </resource>
    </resources>
</build>
```

## 步骤：

1. 编写数据源配置
2. sqlSessionFactory
3. sqlSessionTemplate
4. 给接口加实现类
5. 将实现类注入Spring中
6. 测试

参考：http://mybatis.org/spring/

## 什么是 MyBatis-Spring？

MyBatis-Spring 会帮助你将 MyBatis 代码无缝地整合到 Spring 中。

它将允许 MyBatis 参与到 Spring 的事务管理之中，创建映射器mapper和SqlSession并注入到bean中，

以及将Mybatis的异常转换为Spring的DataAccessException。

最终，可以做到应用代码不依赖于MyBatis，Spring或MyBatis-Spring。