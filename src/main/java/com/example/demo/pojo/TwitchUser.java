package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Ho
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode
@TableName("twitch_user")
public class TwitchUser implements Serializable {

    @Serial
    private static final long serialVersionUID = 7171433468723272192L;

    /**
     * 主播id
     */
    @TableId(type = IdType.INPUT)
    private Integer id;

    /**
     * 主播名称
     */
    private String name;

    /**
     * 显示的名称
     */
    private String displayName;

    /**
     * 投稿中的名字
     */
    private String archiveName;

    /**
     * 搬运优先级
     */
    private Integer priority;

    /**
     * twitch上用户创建的时间
     */
    private LocalDateTime userCreateTime;

    /**
     * logo
     */
    private String logo;

    /**
     * 正在直播的游戏名
     */
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String game;

    /**
     * 当前观众
     */
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer viewers;

    /**
     * 平均帧率
     */
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer averageFps;

    /**
     * 直播延时
     */
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer delay;

    /**
     * 直播类型
     */
    private String streamType;

    /**
     * 开播时间
     */
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private LocalDateTime liveStartTime;

    /**
     * 粉丝数
     */
    private Integer followers;

    /**
     * 观看总量
     */
    private Integer views;

    /**
     * 直播间地址
     */
    private String url;

    /**
     * 是否上传
     */
    private Boolean upload;

    /**
     * 是否观测
     */
    private Boolean observe;

    /**
     * B站收藏夹id
     */
    private Integer favId;
    /**
     * folder id
     */
    private Long folderId;
    /**
     * 封面地址
     */
    private String cover;

    /**
     * 所用上传账号
     */
    private Integer account;

    /**
     * 投稿基础tag
     */
    private String tag;

    /**
     * 添加时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
