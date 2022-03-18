package com.yf.cn.dto;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-17 11:47
 */
@Data
public class OrderDto {
  /***
   * 订单id
   **/
  private int id;
  private String orderCode;

  /**
   * 商品名称
   */
  private String productName;

  /**
   * 商品规格
   */
  private String productSpec;

  /**
   * 商品价格
   */
  private BigDecimal productPrice;

  private String userName;

}
