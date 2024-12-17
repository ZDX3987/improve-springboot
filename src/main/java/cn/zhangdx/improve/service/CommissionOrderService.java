package cn.zhangdx.improve.service;

import cn.zhangdx.improve.pojo.dto.CommissionCreateDTO;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.zhangdx.improve.model.CommissionOrder;

/**
 * 佣金单表
 */
public interface CommissionOrderService extends IService<CommissionOrder> {

    /**
     * 创建佣金单
     *
     * @param commissionCreateDTO 参数
     * @return 佣金单号
     */
    String createCommission(CommissionCreateDTO commissionCreateDTO);

}