package service;

import dao.UsersDao;

public class UsersServiceImpl implements UsersService {
    private UsersDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UsersDao userDao) {
        this.userDao = userDao;
        System.out.println("Coming in UsersServiceImpl setDao");
    }

    @Override
    public void getUsers() {
        userDao.getUsers();
        System.out.println("Coming in UsersServiceImpl");
    }
}
