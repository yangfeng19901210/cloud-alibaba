package com.yf.usercenter.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-21 16:12
 */
public class MyAESUtil {
  private static String cKey = "jkl;POIU1234++==";
  /***
   * @author yf
   * @date 2022-03-21 16:13:42
   * @param sSrc  需要加密的字符串
   * @param sKey  秘钥
   * @return
   **/
  public static String Encrypt(String sSrc, String sKey) throws Exception {
    if (sKey == null) {
      System.out.print("Key为空null");
      return null;
    }
    // 判断Key是否为16位
    if (sKey.length() != 16) {
      System.out.print("Key长度不是16位");
      return null;
    }
    byte[] raw = sKey.getBytes("utf-8");
    SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
    byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
    return new BASE64Encoder().encode(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
  }
  /***
   * @author yf
   * @date 2022-03-21 16:14:48
   * @param sSrc 需要解密的字符串
   * @param sKey 秘钥
   * @return
   **/
  public static String Decrypt(String sSrc, String sKey) throws Exception {
    try {
      // 判断Key是否正确
      if (sKey == null) {
        System.out.print("Key为空null");
        return null;
      }
      // 判断Key是否为16位
      if (sKey.length() != 16) {
        System.out.print("Key长度不是16位");
        return null;
      }
      byte[] raw = sKey.getBytes("utf-8");
      SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.DECRYPT_MODE, skeySpec);
      byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//先用base64解密
      try {
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original,"utf-8");
        return originalString;
      } catch (Exception e) {
        System.out.println(e.toString());
        return null;
      }
    } catch (Exception ex) {
      System.out.println(ex.toString());
      return null;
    }
  }

  public static void main(String[] args) throws Exception {
    String cSrc = "清风扶山，明月映江";
    System.out.println(cSrc);
    // 加密
    String enString = MyAESUtil.Encrypt(cSrc, cKey);
    System.out.println("加密后的字串是：" + enString);

    // 解密
    String DeString = MyAESUtil.Decrypt(enString, "1234567890123456");
    System.out.println("解密后的字串是：" + DeString);
  }


}
