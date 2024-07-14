package cn.zhangdx.improve.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author ZDX
 * @date 2022/5/24 21:38
 */
public class UserRegisterEvent extends ApplicationEvent {
    public UserRegisterEvent(Object source) {
        super(source);
    }
}
