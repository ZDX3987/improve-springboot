package cn.zhangdx.improve.strategy;

import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2022/5/23 21:25
 */
@Component("C")
public class CPublishStrategy implements ArticlePublish{
    @Override
    public void publish(String content) {
        System.out.println("这是"+content+"策略类");
    }
}
