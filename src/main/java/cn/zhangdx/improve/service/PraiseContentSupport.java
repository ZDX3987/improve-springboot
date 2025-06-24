package cn.zhangdx.improve.service;

/**
 * 对内容的点赞支持
 * @author zhangdx
 * @date 2025/6/23 13:20
 */
public interface PraiseContentSupport {

    /**
     * 对内容点赞
     * @return 操作结果
     */
    boolean praise();
}
