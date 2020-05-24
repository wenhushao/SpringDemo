# Spring IoC 02

- IoC创建对象方式
1. 默认无参构造
```xml
<bean id="user" class="net.zeroinfo.pojo.Users">
    <property name="name" value="Hello"/>
</bean>
```

2.有参构造:

下标赋值
```xml
<bean id="user" class="net.zeroinfo.pojo.Users">
    <constructor-arg index="0" value="Hello"/>
</bean>
```

基本类型

```xml
<bean id="user" class="net.zeroinfo.pojo.Users">
    <constructor-arg type="java.lang.String" value="Hello"/>
</bean>
```

参数名

```xml
<bean id="userTwo" class="net.zeroinfo.pojo.UsersTwo">
    <property name="nameTwo" value="Hello UsersTwo"/>
</bean>
```

总结：在配置文件加载的时候，容器中管理的的对象就已经初始化了

- 导入外部配置文件
```xml
<import resource="UsersBean.xml"/>
<import resource="UserTwoBean.xml"/>
```