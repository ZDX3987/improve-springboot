package cn.zhangdx.improve.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangdx
 * @date 2024/8/26 23:40
 */
@Slf4j
@Component
public class UserRegisterListener {

    @EventListener
    public void receiveRegisterEvent(UserRegisterEvent userRegisterEvent) {
        log.info("UserRegisterListener receiveRegisterEvent name-{}", userRegisterEvent.getUsername());
    }
}
