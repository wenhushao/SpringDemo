package annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解来实现
//@Aspect: 标注这个类是一个切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("使用注解");
        System.out.println("方法执行前");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("使用注解");
        System.out.println("方法执行后");
    }

    //在环绕增强中，给定一个参数，代表要获取处理的切入点
    @Around("execution(* service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");

        //获得签名
        Signature signature = pjp.getSignature();
        System.out.println("signature=" + signature);

        //执行方法
        Object proceed = pjp.proceed();

        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
