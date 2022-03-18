package com.yf.cn;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yf.cn.dto.OrderDto;
import com.yf.cn.entity.BusOrder;
import com.yf.cn.entity.BusOrderDetails;
import com.yf.cn.entity.RunoobTbl;
import com.yf.cn.entity.SysUser;
import com.yf.cn.mapper.BusOrderDetailsMapper;
import com.yf.cn.mapper.BusOrderMapper;
import com.yf.cn.mapper.RunoobTblMapper;
import com.yf.cn.mapper.SysUserMapper;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-16 17:53
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class TestMapper {
     //@Autowired
     @Resource
     private  RunoobTblMapper runoobTblMapper;

     @Resource
     private SysUserMapper sysUserMapper;

     @Resource
     private BusOrderMapper busOrderMapper;

     @Resource
     private BusOrderDetailsMapper busOrderDetailsMapper;
     @Test
     public void getById(){
          RunoobTbl runoobTbl = runoobTblMapper.selectById(1);
          log.info("查询到信息 {}"+runoobTbl );
     }

     @Test
     public void testSave(){
          RunoobTbl runoobTbl = RunoobTbl.builder().runoobAuthor("金庸").runoobTitle("天龙八部").submissionDate(new Date()).build();
          runoobTblMapper.insert(runoobTbl);
     }

     @Test
     public void selectPage(){
          //构建Page对象
          Page<RunoobTbl> page = new Page<RunoobTbl>(1,3);

          //构建条件查询队形
          QueryWrapper<RunoobTbl> query = new QueryWrapper<RunoobTbl>();
          //query.eq("runoob_title","笑傲江湖");
          query.like("runoob_title","侠客");
          IPage<RunoobTbl> runoobTblIPage = runoobTblMapper.selectPage(page, query);
          List<RunoobTbl> records = runoobTblIPage.getRecords();
          log.info("获取到分页数据 {}"+records);
     }

     //测试新增用户数据
     @Test
     public void testSaveUser(){
          sysUserMapper.insert(SysUser.builder().userName("李四").build());

     }

     @Test
     public void testSaveOrder(){
          BusOrder busOrder = BusOrder.builder().userId(3).orderCode(String.valueOf(System.currentTimeMillis())).build();
          busOrderMapper.insert(busOrder);
          busOrderDetailsMapper.insert(BusOrderDetails.builder().productName("干吃面").productSpec("小型包装").productPrice(new BigDecimal("12.00")).orderId(busOrder.getId()).build());
     }

     @Test
     public void testSelectPage(){
          Page<OrderDto> page = new Page<OrderDto>(1,3);
          QueryWrapper<OrderDto> queryWrapper = new QueryWrapper<OrderDto>();
          queryWrapper.eq("bo.user_id",2).like("bod.product_name","吃面");
          Page<OrderDto> orderList = busOrderMapper.getOrderList(page, queryWrapper);
          System.out.println(orderList.getRecords());
     }

     @Test
     public void testSelectPageForJoin(){
          Page<OrderDto> page = new Page<OrderDto>(1,3);
          QueryWrapper<OrderDto> queryWrapper = new QueryWrapper<OrderDto>();
          queryWrapper.eq("bo.user_id",2).like("bod.product_name","吃面");
          Page<OrderDto> orderList = busOrderMapper.getOrderListForJoin(page, queryWrapper);
          System.out.println(orderList.getRecords());
     }





}
