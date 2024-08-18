package cn.zhangdx.initializer;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContextInitializer;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<AnnotationConfigServletWebServerApplicationContext> {
    @Override
    public void initialize(AnnotationConfigServletWebServerApplicationContext applicationContext) {
        System.out.println("MyApplicationContextInitializer initialize");
    }
}
