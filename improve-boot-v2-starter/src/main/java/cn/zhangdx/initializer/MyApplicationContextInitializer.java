package cn.zhangdx.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContextInitializer;

@Slf4j
public class MyApplicationContextInitializer implements ApplicationContextInitializer<AnnotationConfigServletWebServerApplicationContext> {
    @Override
    public void initialize(AnnotationConfigServletWebServerApplicationContext applicationContext) {
        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        log.info("MyApplicationContextInitializer customized initialize print application active profiles: {}", activeProfiles);
    }
}
