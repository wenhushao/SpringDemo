package demo02;

public class UsersClient {
    public static void main(String[] args) {
        UsersService usersService = new UsersServiceImpl();
        UsersServiceProxy proxy = new UsersServiceProxy();
        proxy.setUsersService(usersService);
        proxy.add();
    }
}
