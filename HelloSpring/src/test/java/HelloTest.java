import net.zeroinfo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    public static void main(String[] args) {
        //通过ClassPathXmlApplicationContext获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("Hello");
        System.out.println(hello.toString());
        System.out.println(hello.getMessage());
    }
}
