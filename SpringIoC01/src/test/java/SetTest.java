import dao.UsersDaoImpl;
import dao.UsersDaoImpl2;
import service.UsersService;
import service.UsersServiceImpl;

public class SetTest {
    public static void main(String[] args) {
        //用户实际调用业务层
        UsersService usersService = new UsersServiceImpl();

        ((UsersServiceImpl) usersService).setUserDao(new UsersDaoImpl2());
        usersService.getUsers();
    }
}
