package demo04;

public class UsersClient {
    public static void main(String[] args) {
        //真实角色
        UsersServiceImpl usersService = new UsersServiceImpl();
        //代理角色 不存在
        ProxyInvocationHandler pin = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理调用的接口对象
        //设置代理对象
        pin.setTarget(usersService);
        //动态生成代理类
        UsersService proxy = (UsersService) pin.getProxy();
        proxy.add();
    }
}
