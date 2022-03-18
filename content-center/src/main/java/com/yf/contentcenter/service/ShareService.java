package com.yf.contentcenter.service;

import com.yf.contentcenter.dto.ShareDto;
import com.yf.contentcenter.entity.Share;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 分享表 服务类
 * </p>
 *
 * @author yf
 * @since 2022-03-18
 */
public interface ShareService extends IService<Share> {

  //查询用户分享信息
  ShareDto getShareById(Integer id);

}
