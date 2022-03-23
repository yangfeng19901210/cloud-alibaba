package com.yf.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-22 17:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

  private String name;

  private String head;

  private String leg;

  public void run(String name,String leg){
    System.out.println(name+"可以利用"+leg+"快速奔跑");
  }

}
