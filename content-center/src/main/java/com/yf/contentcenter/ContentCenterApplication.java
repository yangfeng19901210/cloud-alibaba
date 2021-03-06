package com.yf.contentcenter;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

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
  /***
   * @LoadBalanced  能让客户端在请求时拥有负载均衡能力
   **/
  @Bean
  @LoadBalanced
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }


}
