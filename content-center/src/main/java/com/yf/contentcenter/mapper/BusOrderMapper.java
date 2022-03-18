package com.yf.contentcenter.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yf.contentcenter.dto.OrderDto;
import com.yf.contentcenter.entity.BusOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yf
 * @since 2022-03-17
 */
public interface BusOrderMapper extends BaseMapper<BusOrder> {

  Page<OrderDto> getOrderList(@Param("page") Page<OrderDto> page,@Param(Constants.WRAPPER) QueryWrapper<OrderDto> qw);

  Page<OrderDto> getOrderListForJoin(@Param("page") Page<OrderDto> page,@Param(Constants.WRAPPER) QueryWrapper<OrderDto> qw);

}
