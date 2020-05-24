import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import net.zeroinfo.pojo.Student;
import net.zeroinfo.pojo.Users;

public class DITest {
    public static void main(String[] args) {
        //获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void pNameSpaceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("UsersBean.xml");
        Users users = context.getBean("users", Users.class);
        Users users2 = context.getBean("users", Users.class);
        System.out.println(users.toString());
        System.out.println(users == users2);
    }

    @Test
    public void cNameSpaceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("UsersBean.xml");
        Users users = context.getBean("usersByC", Users.class);
        System.out.println(users.toString());

        Users users2 = context.getBean("usersByC", Users.class);
        System.out.println(users == users2);

        System.out.println(users.hashCode());
        System.out.println(users2.hashCode());
    }
}
