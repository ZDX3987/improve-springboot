package cn.zhangdx.configuration;

import cn.zhangdx.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 * @author ZDX
 * @date 2022/8/27 17:33
 */
@Configuration
public class TestAutoConfiguration {


    @Bean
    public TestBean testBean() {
        System.out.println("测试自动加载类");
        return new TestBean("这是一个自动加载类");
    }
}
