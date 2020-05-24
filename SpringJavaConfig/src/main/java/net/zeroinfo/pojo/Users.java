package net.zeroinfo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//表示这个类被Spring接管了，注册到容器中
@Component
public class Users {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Hello") //属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                '}';
    }
}
