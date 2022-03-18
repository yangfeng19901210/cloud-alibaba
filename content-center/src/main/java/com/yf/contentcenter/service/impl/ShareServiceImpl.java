package com.yf.contentcenter.service.impl;

import com.yf.contentcenter.dto.ShareDto;
import com.yf.contentcenter.dto.UserDto;
import com.yf.contentcenter.entity.Share;
import com.yf.contentcenter.mapper.ShareMapper;
import com.yf.contentcenter.service.ShareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 分享表 服务实现类
 * </p>
 *
 * @author yf
 * @since 2022-03-18
 */
@Service
public class ShareServiceImpl extends ServiceImpl<ShareMapper, Share> implements ShareService {
  @Autowired
  private DiscoveryClient discoveryClient;
  @Autowired
  private RestTemplate restTemplate;

  @Override
  public ShareDto getShareById(Integer id) {
    Share share = this.baseMapper.selectById(id);
    Integer userId = share.getUserId();
    List<ServiceInstance> instances = discoveryClient.getInstances("user-center");
    String targetUrl = instances.stream()
        .map(serviceInstance -> serviceInstance.getUri().toString() + "/user/{id}")
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("当前没有可用的用户实例"));
    UserDto userDto = restTemplate.getForObject(targetUrl, UserDto.class, userId);
    ShareDto shareDto = new ShareDto();
    shareDto.setNickName(userDto.getWxNickname());
    BeanUtils.copyProperties(share,shareDto);
    return shareDto;
  }
}
