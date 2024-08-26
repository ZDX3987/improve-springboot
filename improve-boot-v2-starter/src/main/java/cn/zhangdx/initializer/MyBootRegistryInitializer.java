package cn.zhangdx.initializer;

import cn.zhangdx.listener.MyBootstrapContextCloseListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;
import org.springframework.boot.DefaultBootstrapContext;

/**
 * Spring boot 启动时初始化扩展
 */
@Slf4j
public class MyBootRegistryInitializer implements BootstrapRegistryInitializer {

    @Override
    public void initialize(BootstrapRegistry registry) {
        log.info("MyBootRegistryInitializer customized initialize!");
        if (registry instanceof DefaultBootstrapContext) {
            MyBootstrapContextCloseListener listener = new MyBootstrapContextCloseListener();
            log.info("MyBootRegistryInitializer customized addCloseListener:{}", listener.getClass().getSimpleName());
            registry.addCloseListener(listener);
        }
    }
}
