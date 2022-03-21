package com.yf.usercenter;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-21 17:15
 */
public class TestAes {

  public static void main(String[] args) {
    String content = "test中文";
    //随机生成密钥
    byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
    //构建
    SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, key);
    //加密
    String encStr = aes.encryptBase64(content);
    System.out.println(encStr);
    //解密
    String decStr = aes.decryptStr(encStr);
    System.out.println(decStr);
    //加密为16进制表示
    String encryptHex = aes.encryptHex(content);
    //解密为字符串
    String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
  }

}
