package net.zeroinfo.dao;

import net.zeroinfo.pojo.Users;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UsersTemplate implements UsersDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void add(Users users) {
        String SQL = "insert into users (name,password) values (?,?)";
        jdbcTemplateObject.update(SQL, users.getName(), users.getPassword());
    }

    @Override
    public Users selectOne(Integer id) {
        String SQL = "select * from users where id = ?";
        Users users = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new UsersMapper());
        return users;
    }

    @Override
    public List<Users> selectAll() {
        String SQL = "select * from users";
        List<Users> users = jdbcTemplateObject.query(SQL, new UsersMapper());
        return users;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from user where id = ?";
        jdbcTemplateObject.update(SQL, id);
    }

    @Override
    public void update(Users users) {
        String SQL = "update users set name = ?, password=? where id = ?";
        jdbcTemplateObject.update(SQL, users.getName(), users.getPassword(), users.getId());
    }
}
