import net.zeroinfo.dao.UsersMapper;
import net.zeroinfo.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void selectAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UsersMapper usersMapper = context.getBean("usersMapper", UsersMapper.class);
        for (Users users : usersMapper.selectAllUsers()) {
            System.out.println(users);
        }
    }


    @Test
    public void selectAll2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UsersMapper usersMapper = context.getBean("usersMapper2", UsersMapper.class);
        for (Users users : usersMapper.selectAllUsers()) {
            System.out.println(users);
        }
    }
}
