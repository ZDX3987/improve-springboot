package cn.zhangdx.improve.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.zhangdx.improve.model.CommissionOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * 佣金单表
 */
@Mapper
public interface CommissionOrderMapper extends BaseMapper<CommissionOrder> {

}