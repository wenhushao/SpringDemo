package net.zeroinfo.dao;

import net.zeroinfo.pojo.Users;

import java.util.List;

public interface UsersMapper {
//    int add();
//    int addMapper(Map<String, Object> map);
//    int update();
//    int updateMapper(Map<String, Object> map);
//    int delete();
//    Users selectOne();
    List<Users> selectAllUsers();
}
