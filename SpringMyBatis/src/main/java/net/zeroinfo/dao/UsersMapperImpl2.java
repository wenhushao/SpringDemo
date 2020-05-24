package net.zeroinfo.dao;

import net.zeroinfo.pojo.Users;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UsersMapperImpl2 extends SqlSessionDaoSupport implements UsersMapper {
    @Override
    public List<Users> selectAllUsers() {
        SqlSession sqlSession = getSqlSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        return mapper.selectAllUsers();
    }
}
