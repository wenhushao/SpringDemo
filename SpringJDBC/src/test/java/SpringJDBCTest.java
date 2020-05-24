import net.zeroinfo.dao.UsersTemplate;
import net.zeroinfo.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJDBCTest {

    @Test
    public void selectAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersTemplate usersTemplate = context.getBean("usersTemplate", UsersTemplate.class);
        List<Users> usersList = usersTemplate.selectAll();
        for (Users users : usersList) {
            System.out.println(users.toString());
        }
    }

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersTemplate usersTemplate = context.getBean("usersTemplate", UsersTemplate.class);
        Users users = new Users();
        users.setName("测试");
        users.setPassword("SpringJDBCTest");
        usersTemplate.add(users);
    }

    @Test
    public void update() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersTemplate usersTemplate = context.getBean("usersTemplate", UsersTemplate.class);
        Users users = new Users();
        users.setId(40);
        users.setName("测试");
        users.setPassword("SpringJDBC");
        usersTemplate.update(users);
    }

    @Test
    public void selectOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersTemplate usersTemplate = context.getBean("usersTemplate", UsersTemplate.class);
        Users users = new Users();
        users.setId(40);
        System.out.println(usersTemplate.selectOne(users.getId()));
    }

}
