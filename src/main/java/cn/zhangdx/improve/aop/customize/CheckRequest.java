package cn.zhangdx.improve.aop.customize;

import java.lang.annotation.*;

/**
 * @author ZDX
 * @date 2022/8/19 20:18
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CheckRequest {

    String value();

}
