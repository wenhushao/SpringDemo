package net.zeroinfo.config;

import net.zeroinfo.pojo.Users;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//表示这个类被Spring接管了，注册到容器中 本质是@Component
//@Configuration代表这是一个配置类，类似bean.xml
@Configuration
@ComponentScan("net.zeroinfo.pojo")     //扫描注解
public class UsersConfig {

    //注册bean id:方法名 class：返回值
    @Bean
    public Users getUsers() {
        return new Users();
    }
}
