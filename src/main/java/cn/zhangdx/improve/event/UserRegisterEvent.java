package cn.zhangdx.improve.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author ZDX
 * @date 2022/5/24 21:38
 */
public class UserRegisterEvent extends ApplicationEvent {

    private String username;

    public UserRegisterEvent(Object source, String username) {
        super(source);
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
}
