package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 收藏夹[√]
 *
 * @author Ho
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode
@TableName("bilibili_folder")
public class BilibiliFolder implements Serializable {

    @Serial
    private static final long serialVersionUID = 7205329061049203177L;
    /**
     * 记录id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 记录创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 记录更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
