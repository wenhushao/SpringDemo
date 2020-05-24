import net.zeroinfo.pojo.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Users users = context.getBean("users", Users.class);
        System.out.println(users.name);
    }
}
