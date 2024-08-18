package cn.zhangdx.improve.initializer;

import cn.zhangdx.improve.listener.BootstrapContextCloseListener;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;
import org.springframework.boot.DefaultBootstrapContext;

/**
 * Spring boot 启动时初始化扩展
 */
public class MyBootRegistryInitializer implements BootstrapRegistryInitializer {

    @Override
    public void initialize(BootstrapRegistry registry) {
        if (registry instanceof DefaultBootstrapContext) {
            ((DefaultBootstrapContext) registry).addCloseListener(new BootstrapContextCloseListener());
        }
        System.out.println("自定义Spring boot初始化器初始化：" + registry.getClass().getName());
    }
}
