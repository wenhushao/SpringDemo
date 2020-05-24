import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import net.zeroinfo.pojo.Users;
import net.zeroinfo.pojo.UsersTwo;

public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Users user = (Users) context.getBean("user");
        System.out.println(user.toString());
        System.out.println("========================");
        UsersTwo usersTwo = (UsersTwo) context.getBean("userTwo");
        System.out.println(usersTwo.toString());
    }
}