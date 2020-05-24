package defined;

public class UserPointcut {
    public void before() {
        System.out.println("使用自定义类");
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("使用自定义类");
        System.out.println("方法执行后");
    }
}
