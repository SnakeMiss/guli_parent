package com.atguigu.orderservice.service;

import com.atguigu.orderservice.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author hskBeginner
 * @since 2021-09-13
 */
public interface OrderService extends IService<Order> {

    String createOrders(String courseId, String memberId);
}
