# Spring Dependency Injection
## 构造器注入

## Set注入

## P /C Namespace注入

* P namespace property

官方：

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:p="http://www.springframework.org/schema/p"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean name="classic" class="com.example.ExampleBean">
        <property name="email" value="someone@somewhere.com"/>
    </bean>

    <bean name="p-namespace" class="com.example.ExampleBean"
        p:email="someone@somewhere.com"/>
</beans>
```

引入

```xml
xmlns:p="http://www.springframework.org/schema/p"
```

```xml
<bean id="users" class="net.zeroinfo.pojo.Users" p:name="P name" p:age="20"/>
```

* C namespace constructor-arg

引入

```xml
xmlns:c="http://www.springframework.org/schema/c"
```

```xml
<bean id="usersByC" class="net.zeroinfo.pojo.Users" c:name="Cc" c:age="12"/>
```

## Bean作用域


1. 单例模式 (Spring默认机制)
```xml
<bean id="users" class="net.zeroinfo.pojo.Users" p:name="P name" p:age="20" scope="singleton"/>
```
2. 原型模式

每次从容器中get的时候,都会产生一个新对象
```xml
<bean id="usersByC" class="net.zeroinfo.pojo.Users" c:name="Cc" c:age="12" scope="prototype"/>
```
