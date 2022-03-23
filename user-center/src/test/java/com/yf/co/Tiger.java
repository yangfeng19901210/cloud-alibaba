package com.yf.co;

import com.yf.po.Animal;
import lombok.Data;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-22 17:11
 */
@Data
public class Tiger extends Animal {

  private String zhuzi;

//  @Override
//  public void run(String name, String leg) {
//    System.out.println(name+"拥有锋利的爪子，可以轻易的捕获猎物");
//  }
  public Tiger(){
    super.setName("老虎");
  }
}
