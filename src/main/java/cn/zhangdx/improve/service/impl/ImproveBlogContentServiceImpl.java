package cn.zhangdx.improve.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.zhangdx.improve.model.ImproveBlogContent;
import cn.zhangdx.improve.service.ImproveBlogContentService;
import cn.zhangdx.improve.service.PraiseContentSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ImproveBlogContentServiceImpl implements ImproveBlogContentService, PraiseContentSupport {

    /**
     * 对内容点赞
     *
     * @return 操作结果
     */
    @Override
    public boolean praise() {
        log.info("ImproveBlogContent 点赞成功");
        return true;
    }

    @Override
    public void saveBlogContentTest() {
        ImproveBlogContent improveBlogContent = new ImproveBlogContent();
        improveBlogContent.setName(IdUtil.getSnowflakeNextIdStr());
        improveBlogContent.setContent("这是测试的内容：" + improveBlogContent.getName());
//        this.save(improveBlogContent);
    }
}