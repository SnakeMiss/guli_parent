package com.atguigu.orderservice.controller;


import com.atguigu.orderservice.entity.Order;
import com.atguigu.orderservice.feginclient.CourseFegin;
import com.atguigu.orderservice.feginclient.UsersFegin;
import com.atguigu.orderservice.service.OrderService;
import com.atguigu.util.JwtUtils;
import com.atguigu.util.R;
import com.atguigu.util.edu.EduCourse;
import com.atguigu.util.ucenter.Member;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.OrderUtils;
import org.springframework.http.HttpRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 订单 前端控制器
 * </p>
 *
 * @author hskBeginner
 * @since 2021-09-13
 */
@RestController
@RequestMapping("/orderservice/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("createOrder/{courseId}")
    @Transactional
    public String createOrder(@PathVariable String courseId ,String memberId,HttpServletRequest request) {
        String orderNo=orderService.createOrders(courseId,memberId);
        return orderNo;
    }
}

