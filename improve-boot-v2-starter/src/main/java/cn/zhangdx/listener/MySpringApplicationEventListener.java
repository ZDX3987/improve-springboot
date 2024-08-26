package cn.zhangdx.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangdx
 * @date 2024/8/26 23:32
 */
@Slf4j
public class MySpringApplicationEventListener implements ApplicationListener<SpringApplicationEvent> {

    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
        String simpleName = event.getClass().getSimpleName();
        log.info("MySpringApplicationEventListener onApplicationEvent spring application event name-{}", simpleName);
    }
}
