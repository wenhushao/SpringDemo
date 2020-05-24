package demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Landlord landlord = new Landlord();
        //代理角色 不存在
        ProxyInvocationHandler pin = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理调用的接口对象
        pin.setRentHouse(landlord);
        //动态生成proxy
        RentHouse proxy = (RentHouse) pin.getProxy();
        proxy.rentHouse();

    }
}
