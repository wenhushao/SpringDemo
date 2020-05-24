package demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房
        Landlord landlord = new Landlord();
        //代理
        Proxy proxy = new Proxy(landlord);
        //找中介租房
        proxy.rentHouse();
    }
}
