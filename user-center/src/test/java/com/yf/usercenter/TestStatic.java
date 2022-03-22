package com.yf.usercenter;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试java 静态代码块执行的时机
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-22 9:57
 */
public class TestStatic {

  private static Map<String,Object> map = null;

  static{
    map = new HashMap<String,Object>();
    map.put("1","张三");
    map.put("2","李四");
    map.put("3","王五");
    map.put("4","赵六");
    map.put("5","小柒");
  }

  public static Map<String,Object>  getMap(){
    return map;
  }

}
