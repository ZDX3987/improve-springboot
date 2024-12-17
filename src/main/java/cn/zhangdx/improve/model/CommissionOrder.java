package cn.zhangdx.improve.model;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.math.BigDecimal;
import java.util.Date;
/**
* 佣金单表
*/
@Data
@TableName("commission_order")
public class CommissionOrder {
    /**
    * 
    */
    @TableId
    @TableField("id")
    private Integer id;
    /**
    * 
    */
    @TableField("order_no")
    private String orderNo;
    /**
    * 手机号
    */
    @TableField("user_phone")
    private String userPhone;
    /**
    * 金额
    */
    @TableField("commission_money")
    private BigDecimal commissionMoney;
    /**
    * 0-无效，1-待发放，2-发放中，3-已发放
    */
    @TableField("status")
    private Integer status;
    /**
    * 
    */
    @TableField("created_at")
    private Date createdAt;
    /**
    * 
    */
    @TableField("updated_at")
    private Date updatedAt;
}