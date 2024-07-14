package cn.zhangdx.improve;

import cn.zhangdx.improve.event.EventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ImproveSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ImproveSpringbootApplication.class, args);
        applicationContext.getBean(EventPublisher.class).register();
    }

}
