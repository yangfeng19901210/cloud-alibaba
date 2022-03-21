package com.yf.usercenter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-21 16:36
 */
public class TestGenerateCode {

  public static void main(String[] args) {
    String path = "D:/codeHome/entity";
    File file = new File(path);
    if (!file.exists()) {
      file.mkdirs();
    }
    StringBuilder sb = new StringBuilder();
    sb.append("com.yf.usercenter\n");
    sb.append("public class User {\n");
    sb.append("   private String name;\n");
    sb.append("}");
    string2File(sb.toString(),"D:/codeHome/entity/User.java");
  }

  public static boolean string2File(String res, String filePath) {
    boolean flag = true;
    BufferedReader bufferedReader = null;
    BufferedWriter bufferedWriter = null;
    try {
      File distFile = new File(filePath);
      if (!distFile.getParentFile().exists()) distFile.getParentFile().mkdirs();
      bufferedReader = new BufferedReader(new StringReader(res));
      bufferedWriter = new BufferedWriter(new FileWriter(distFile));
      char buf[] = new char[1024];         //字符缓冲区
      int len;
      while ((len = bufferedReader.read(buf)) != -1) {
        bufferedWriter.write(buf, 0, len);
      }
      bufferedWriter.flush();
      bufferedReader.close();
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
      flag = false;
      return flag;
    } finally {
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return flag;
  }

}
