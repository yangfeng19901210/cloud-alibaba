package com.yf.contentcenter.controller;


import com.yf.contentcenter.dto.ShareDto;
import com.yf.contentcenter.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分享表 前端控制器
 * </p>
 *
 * @author yf
 * @since 2022-03-18
 */
@RestController
@RequestMapping("/share")
public class ShareController {

  @Autowired
  private ShareService shareService;
  @GetMapping("/{id}")
  public ShareDto getShareById(@PathVariable Integer id){
    return shareService.getShareById(id);
  }

}

