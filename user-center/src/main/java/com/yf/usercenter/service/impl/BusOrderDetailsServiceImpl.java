package com.yf.usercenter.service.impl;

import com.yf.usercenter.entity.BusOrderDetails;
import com.yf.usercenter.mapper.BusOrderDetailsMapper;
import com.yf.usercenter.service.BusOrderDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yf
 * @since 2022-03-17
 */
@Service
public class BusOrderDetailsServiceImpl extends ServiceImpl<BusOrderDetailsMapper, BusOrderDetails> implements BusOrderDetailsService {

  @Autowired
  private DiscoveryClient discoveryClient;

  public void testPost(){
    //获取服务的id
    List<ServiceInstance> instances = discoveryClient.getInstances("server-01");
    //instances.stream().map(serviceInstance -> serviceInstance.getUri().toString()).findFirst().orElseThrow();
  }

}
