package cn.zhangdx.improve.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.RandomUtil;
import cn.zhangdx.improve.pojo.dto.CommissionCreateDTO;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.zhangdx.improve.model.CommissionOrder;
import cn.zhangdx.improve.dao.CommissionOrderMapper;
import cn.zhangdx.improve.service.CommissionOrderService;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class CommissionOrderServiceImpl extends ServiceImpl<CommissionOrderMapper, CommissionOrder> implements CommissionOrderService{

    public static final String ORDER_NO_PREFIX = "YJ";

    /**
     * 创建佣金单
     *
     * @param commissionCreateDTO 参数
     * @return 佣金单号
     */
    @Transactional
    @Override
    public String createCommission(CommissionCreateDTO commissionCreateDTO) {
        CommissionOrder commissionOrder = new CommissionOrder();
        commissionOrder.setUserPhone(commissionCreateDTO.getUserPhone());
        commissionOrder.setCommissionMoney(commissionCreateDTO.getCommissionMoney());
        commissionOrder.setOrderNo(genOrderNo());
        commissionOrder.setStatus(1);
        this.save(commissionOrder);
        return commissionOrder.getOrderNo();
    }

    private String genOrderNo() {
        String orderNo = ORDER_NO_PREFIX;
        orderNo += LocalDateTimeUtil.format(LocalDate.now(), "yyyyMMdd");
        orderNo += RandomUtil.randomString(6);
        return orderNo;
    }
}