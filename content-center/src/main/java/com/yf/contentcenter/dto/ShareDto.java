package com.yf.contentcenter.dto;

import java.util.Date;
import lombok.Data;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-18 16:30
 */
@Data
public class ShareDto {

  private Integer id;

  /**
   * 发布人id
   */
  private Integer userId;

  /**
   * 标题
   */
  private String title;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 修改时间
   */
  private Date updateTime;

  /**
   * 是否原创 0:否 1:是
   */
  private Integer isOriginal;

  /**
   * 作者
   */
  private String author;

  /**
   * 封面
   */
  private String cover;

  /**
   * 概要信息
   */
  private String summary;

  /**
   * 价格（需要的积分）
   */
  private Integer price;

  /**
   * 下载地址
   */
  private String downloadUrl;

  /**
   * 下载数
   */
  private Integer buyCount;

  /**
   * 是否显示 0:否 1:是
   */
  private Integer showFlag;

  /**
   * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
   */
  private String auditStatus;

  /**
   * 审核不通过原因
   */
  private String reason;
  /***
   * 分享用户
   **/
  private String nickName;

}
