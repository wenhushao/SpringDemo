import net.zeroinfo.config.UsersConfig;
import net.zeroinfo.pojo.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        //通过AnnotationConfigApplicationContext获取Spring上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(UsersConfig.class);
        Users users = (Users) context.getBean("getUsers");
        System.out.println(users.getName());
    }
}
