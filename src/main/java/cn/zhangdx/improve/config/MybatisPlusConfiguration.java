package cn.zhangdx.improve.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangdx
 * @date 2025/6/20 22:11
 */
@MapperScan("cn.zhangdx.improve.dao")
@Configuration
public class MybatisPlusConfiguration {
}
