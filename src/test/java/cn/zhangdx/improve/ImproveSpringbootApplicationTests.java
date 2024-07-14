package cn.zhangdx.improve;

import cn.zhangdx.improve.strategy.ArticlePublish;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class ImproveSpringbootApplicationTests {
    @Autowired
    private Map<String, ArticlePublish> articlePublishMap;

    @Test
    void contextLoads() {
        articlePublishMap.entrySet().forEach(entry -> entry.getValue().publish(entry.getKey()));

    }

}
