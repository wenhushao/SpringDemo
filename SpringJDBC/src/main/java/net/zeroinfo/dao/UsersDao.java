package net.zeroinfo.dao;

import net.zeroinfo.pojo.Users;

import javax.sql.DataSource;
import java.util.List;

public interface UsersDao {
    public void add(Users users);

    public Users selectOne(Integer id);

    public List<Users> selectAll();

    public void delete(Integer id);

    public void update(Users users);
}