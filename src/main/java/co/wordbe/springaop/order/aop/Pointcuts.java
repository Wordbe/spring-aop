package co.wordbe.springaop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    // co.wordbe.springaop.order 패키지와 하위 패키지
    @Pointcut("execution(* co.wordbe.springaop.order..*(..))")
    public void allOrder() {} // pointcut signature 이라고 한다.

    // 클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {}

    // allOrder() 와 allService()
    @Pointcut("allOrder() && allService()")
    public void allOrderService() {}
}
