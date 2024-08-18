package cn.zhangdx.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.BootstrapContextClosedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhangdx
 * @date 2024/8/18 12:08
 */
@Slf4j
public class BootstrapContextCloseListener implements ApplicationListener<BootstrapContextClosedEvent> {

    @Override
    public void onApplicationEvent(BootstrapContextClosedEvent event) {
        ConfigurableApplicationContext applicationContext = event.getApplicationContext();
        log.info("监听到SpringBoot启动器关闭事件------------------{}", applicationContext.getDisplayName());
    }
}
