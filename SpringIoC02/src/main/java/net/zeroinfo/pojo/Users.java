package net.zeroinfo.pojo;

public class Users {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users() {
        System.out.println("Users 无参构造");
    }

    public Users(String name) {
        this.name = name;
        System.out.println("Users 有参构造");
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                '}';
    }
}
