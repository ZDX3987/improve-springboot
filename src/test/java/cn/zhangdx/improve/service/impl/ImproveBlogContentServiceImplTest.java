package cn.zhangdx.improve.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ImproveBlogContentServiceImplTest {

    @Autowired
    private ImproveBlogContentServiceImpl improveBlogContentService;

    @Test
    void saveBlogContentTest() {
        improveBlogContentService.praise();
    }
}