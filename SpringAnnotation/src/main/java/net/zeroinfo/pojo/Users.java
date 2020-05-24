package net.zeroinfo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Users {
    @Value("Hello")
    public String name;
}
