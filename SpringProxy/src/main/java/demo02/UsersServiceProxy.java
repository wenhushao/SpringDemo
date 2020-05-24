package demo02;

public class UsersServiceProxy implements UsersService {
    private UsersService usersService;

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public void add() {
        usersService.add();
        prtintLog("add");
    }

    @Override
    public void delete() {
        usersService.delete();
        prtintLog("delete");
    }

    @Override
    public void update() {
        usersService.update();
        prtintLog("update");
    }

    @Override
    public void query() {
        usersService.query();
        prtintLog("query");
    }

    //日志方法
    public void prtintLog(String messages) {
        System.out.println("[DEBUG] 使用了" + messages + "方法");
    }
}
