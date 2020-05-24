package demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private RentHouse rentHouse;

    public void setRentHouse(RentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    //生成得到代理类
    protected Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rentHouse.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //动态代理的本质 就是反射机制实现
        Object result = method.invoke(rentHouse, args);
        seeHouse();
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }
}
