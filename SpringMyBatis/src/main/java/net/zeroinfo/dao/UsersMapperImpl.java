package net.zeroinfo.dao;

import net.zeroinfo.pojo.Users;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UsersMapperImpl implements UsersMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Users> selectAllUsers() {
        UsersMapper mapper = sqlSessionTemplate.getMapper(UsersMapper.class);
        return mapper.selectAllUsers();
    }
}
