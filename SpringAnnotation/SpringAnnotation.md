# Spring Annotation 注解
## 使用注解自动装配
xml配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

## 注解说明

- @Autowired:自动装配 通过类型，名称
如果@Autowired 不唯一通过@Qualifier(value="xxx")

- @Qualifier:自动装配 根据名称可以设置属性名

- @Nullable: 字段可以为null

- @Resource:这个注解属于Java EE的，默认安照名称进行装配，名称可以通过name属性进行指定，
            如果没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，
            如果注解写在setter方法上默认取属性名进行装配。 
            当找不到与名称匹配的bean时才按照类型进行装配。
            但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配

- @Component:声明一个组件类，放在类名上，说明该类被Spring管理来，就是Beans!

@Component 衍生注解
- @Repository: dao
- @Service: service
- @Controller: controller