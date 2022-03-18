package com.yf.contentcenter.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.util.Date;
import lombok.Data;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-18 16:48
 */
@Data
public class UserDto {


  /**
   * Id
   */
  private Integer id;

  /**
   * 微信id
   */
  private String wxId;

  /**
   * 微信昵称
   */
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
  private Date createTime;

  /**
   * 修改时间
   */
  private Date updateTime;

  /**
   * 积分
   */
  private Integer bonus;


}
