package cn.zhangdx.improve.model;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.experimental.Accessors;

import java.util.Date;
/**
* 博客内容
*/
@Accessors(chain = true)
@Data
@TableName("improve_blog_content")
public class ImproveBlogContent {
    /**
    * 
    */
    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;
    /**
    * 名称
    */
    @TableField("name")
    private String name;
    /**
    * 内容
    */
    @TableField("content")
    private String content;
    /**
    * 路由
    */
    @TableField("route")
    private String route;
    /**
    * 
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