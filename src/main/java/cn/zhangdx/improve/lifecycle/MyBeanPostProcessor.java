package cn.zhangdx.improve.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author ZDX
 * @date 2022/5/30 21:33
 */
@Slf4j
@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor, DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "lifeCycle")) {
            log.info("lifeCycle 销毁前置处理器");
        }
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        return DestructionAwareBeanPostProcessor.super.requiresDestruction(bean);
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (Objects.equals(beanName, "lifeCycle")) {
            log.info("lifeCycle 实例化前置处理器");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "lifeCycle")) {
            log.info("lifeCycle 实例化后置处理器");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "lifeCycle")) {
            log.info("lifeCycle 依赖注入处理器：{}", pvs.getPropertyValue("name"));
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "lifeCycle")) {
            log.info("lifeCycle 初始化前置处理器");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (Objects.equals(beanName, "lifeCycle")) {
            log.info("lifeCycle 初始化后置处理器");
        }
        return bean;
    }
}
