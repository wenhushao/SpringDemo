package net.zeroinfo.dao;

import net.zeroinfo.pojo.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersMapper implements RowMapper<Users> {

    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users users = new Users();
        users.setId(rs.getInt("id"));
        users.setName(rs.getString("name"));
        users.setPassword(rs.getString("password"));
        return users;
    }
}
