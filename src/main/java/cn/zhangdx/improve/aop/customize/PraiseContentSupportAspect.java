package cn.zhangdx.improve.aop.customize;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhangdx
 * @date 2025/6/23 13:33
 */
@Slf4j
@Aspect
@Component
public class PraiseContentSupportAspect {

    @Pointcut("execution(* cn.zhangdx.improve.service.PraiseContentSupport.praise(..))")
    public void praiseSupport() {}

    @After("praiseSupport()")
    public void postAfterPraise(JoinPoint joinPoint) {
        String declaringTypeName = joinPoint.getSignature().getDeclaringTypeName();
        log.info(" {} 点赞操作进行后置处理！", declaringTypeName);
    }
}
