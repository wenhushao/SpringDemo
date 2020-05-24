import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UsersServiceImpl;

public class BeanTest {
    public static void main(String[] args) {
        //获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersServiceImpl usersService = (UsersServiceImpl) context.getBean("usersServiceImpl");
        usersService.getUsers();
    }
}
