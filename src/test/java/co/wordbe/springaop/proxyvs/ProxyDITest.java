package co.wordbe.springaop.proxyvs;

import co.wordbe.springaop.order.member.MemberService;
import co.wordbe.springaop.order.member.MemberServiceImpl;
import co.wordbe.springaop.proxyvs.code.ProxyDIAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
//@SpringBootTest(properties = {"spring.aop.proxy-target-class=false"}) // JDK 동적 프록시
//@SpringBootTest(properties = {"spring.aop.proxy-target-class=true"}) // CGLIB 프록시 (기본)
@SpringBootTest
@Import(ProxyDIAspect.class)
public class ProxyDITest {
    @Autowired
    MemberService memberService;

    @Autowired
    MemberServiceImpl memberServiceImpl;

    @Test
    void go() {
        log.info("memberService class: {}", memberService.getClass());
        log.info("memberServiceImpl class: {}", memberServiceImpl.getClass());
        memberServiceImpl.hello("안녕하세요");
    }
}