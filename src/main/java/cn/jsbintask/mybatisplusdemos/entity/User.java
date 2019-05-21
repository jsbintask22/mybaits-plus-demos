package cn.jsbintask.mybatisplusdemos.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author jsbintask@gmail.com
 * @date 2019/5/21 21:42
 */
@TableName("user")
@Data
public class User {
    @TableField("id")
    private Integer id;

    @TableField("username")
    private String username;

    @TableField("class")
    private String clazz;
}
