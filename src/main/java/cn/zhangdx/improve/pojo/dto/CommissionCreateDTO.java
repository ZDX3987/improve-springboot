package cn.zhangdx.improve.pojo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 佣金单创建参数
 * @author zhangdx
 * @date 2024/12/17 22:14
 */
@Data
@Accessors(chain = true)
public class CommissionCreateDTO {

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 佣金单金额
     */
    private BigDecimal commissionMoney;

}
