package cn.zhangdx.improve.spring;

import cn.zhangdx.improve.lifecycle.MyBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.lang.reflect.Method;

/**
 * @author ZDX
 * @date 2022/8/19 20:37
 */
public class CustomizeSpringBoot {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CustomizeSpringBoot.class);
        ConfigurableApplicationContext applicationContext = springApplication.run(args);
        springApplication.addInitializers(applicationContext1 -> {
            if (applicationContext1 instanceof GenericApplicationContext) {
                GenericApplicationContext genericApplicationContext = (GenericApplicationContext)applicationContext1;
                genericApplicationContext.registerBean(MyBeanPostProcessor.class);
                genericApplicationContext.registerBean(TomcatServletWebServerFactory.class);
            }
        });

        springApplication.addListeners(event -> System.out.println("事件类型：" + event.getClass()));

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {

            System.out.println(applicationContext.getBeanFactory().getBeanDefinition(beanDefinitionName).getResourceDescription());
        }


    }
}
