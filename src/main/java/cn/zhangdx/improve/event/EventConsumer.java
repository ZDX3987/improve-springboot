package cn.zhangdx.improve.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2022/5/24 21:41
 */
@Component
public class EventConsumer {


    @EventListener
    public void consumer(UserRegisterEvent event) {
        System.out.println(event.getSource());
    }
}
