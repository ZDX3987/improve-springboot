package cn.zhangdx.improve;

import org.springframework.boot.SpringApplication;

/**
 * @author zhangdx
 * @date 2024/8/17 18:00
 */
public class TestOtherApplication {

    public static void main(String[] args) {
        // SpringBoot启动的main方法可以是任何类中的，但是 SpringApplication.run() 方法的参数必须是包含 @SpringBootApplication 注解的类
        SpringApplication.run(ImproveSpringbootApplication.class, args);
    }
}
