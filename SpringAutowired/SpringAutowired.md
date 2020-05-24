# Bean Autowired 自动装配
- 环境搭建
```xml
<bean id="cat" class="net.zeroinfo.pojo.Cat"/>
<bean id="dog" class="net.zeroinfo.pojo.Dog"/>

<bean id="person" class="net.zeroinfo.pojo.Person">
    <property name="name" value="人"/>
    <property name="cat" ref="cat"/>
    <property name="dog" ref="dog"/>
</bean>
```
测试

   ```java
 public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person=context.getBean("person",Person.class);
        person.getCat().cry();
        person.getDog().cry();
    }
```

- byName自动装配：byName:会自动在容器上下文查找 和自己对象set方法后面的值对应的beanId
```xml
<bean id="cat" class="net.zeroinfo.pojo.Cat"/>
<bean id="dog" class="net.zeroinfo.pojo.Dog"/>

<bean id="person" class="net.zeroinfo.pojo.Person" autowire="byName">
    <property name="name" value="人"/>
</bean>
```
注意： bean id唯一

- byType自动装配：会自动在容器上下文查找 和自己对象set方法后面的值对应的class
```xml
<bean id="cat" class="net.zeroinfo.pojo.Cat"/>
<bean id="dog" class="net.zeroinfo.pojo.Dog"/>

<bean id="person" class="net.zeroinfo.pojo.Person" autowire="byType">
    <property name="name" value="人"/>
</bean>
```
注意： bean class唯一