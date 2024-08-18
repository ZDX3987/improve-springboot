package cn.zhangdx.improve.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2022/5/24 21:40
 */
@Component
public class EventPublisher {

    @Autowired
    private ApplicationEventPublisher context;

    public void register() {
        context.publishEvent(new UserRegisterEvent("你好"));
    }
}
