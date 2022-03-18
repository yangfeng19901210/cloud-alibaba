package com.yf.contentcenter;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-16 17:04
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yf.contentcenter.mapper")
public class ContentCenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(ContentCenterApplication.class, args);
  }

  @Bean
  public PaginationInterceptor paginationInterceptor() {
    return new PaginationInterceptor();
  }


}
