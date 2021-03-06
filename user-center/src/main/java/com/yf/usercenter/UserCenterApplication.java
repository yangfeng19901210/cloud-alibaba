package com.yf.usercenter;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-16 17:04
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yf.usercenter.mapper")
@EnableOpenApi
public class UserCenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserCenterApplication.class, args);
  }

  @Bean
  public PaginationInterceptor paginationInterceptor() {
    return new PaginationInterceptor();
  }


}
