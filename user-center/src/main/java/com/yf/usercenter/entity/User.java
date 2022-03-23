package com.yf.usercenter.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分享
 * </p>
 * @Data 会自动生成get、set、equals、hashCode、canEqual、toString
 * @author yf
 * @since 2022-03-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 微信id
     */
    @NotBlank(message = "微信id不能为空")
    private String wxId;

    /**
     * 微信昵称
     */
    @NotBlank(message = "微信昵称不能为空")
    private String wxNickname;

    /**
     * 角色
     */
    private String roles;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 积分
     */
    private Integer bonus;


}
