package com.yecheng.springbootdruid.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * (Study)表实体类
 *
 * @author Yelf
 * @since 2023-12-04 23:09:24
 */
@Data
public class Study implements Serializable {
    private static final long serialVersionUID = -29651074873790154L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value = "num")
    private Integer num;
    @TableField(value = "name")
    private String name;
}
