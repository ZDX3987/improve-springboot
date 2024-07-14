package cn.zhangdx.improve.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ZDX
 * @date 2022/5/30 21:16
 */
@Slf4j
@Component("lifeCycle")
public class LifeCycleBean {

    private String name;

    public LifeCycleBean() {
        log.info("LifeCycleBean 实例化");
    }

    @Autowired
    public void setA(@Value("${a.b:测试}") String name) {
        this.name = name;
        log.info("LifeCycleBean 依赖注入：{}", this.name);
    }

    @PostConstruct
    public void construct() {
        log.info("LifeCycleBean 初始化");
    }

    @PreDestroy
    public void destory() {
        log.info("LifeCycleBean 销毁");
    }
}
