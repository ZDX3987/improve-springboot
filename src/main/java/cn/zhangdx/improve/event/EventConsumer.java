package cn.zhangdx.improve.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2022/5/24 21:41
 */
@Slf4j
@Component
public class EventConsumer {


    @EventListener
    public UserRegisterEvent consumer(SpringApplicationEvent event) {
        String simpleName = event.getClass().getSimpleName();
        log.info("EventConsumer consumer spring application event name-{}", simpleName);
        return new UserRegisterEvent(event.getSource(), "zhangdx");
    }
}
