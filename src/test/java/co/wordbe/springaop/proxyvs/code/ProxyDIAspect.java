package co.wordbe.springaop.proxyvs.code;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Slf4j
@Aspect
public class ProxyDIAspect {

    @Before("execution(* co.wordbe.springaop..*.*(..))")
    public void doTrace(JoinPoint joinpoint) {
        log.info("[ProxyDIAspect] {}", joinpoint.getSignature());
    }
}
