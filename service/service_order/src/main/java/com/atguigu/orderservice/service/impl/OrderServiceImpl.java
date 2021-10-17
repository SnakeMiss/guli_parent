package com.atguigu.orderservice.service.impl;

import com.atguigu.orderservice.entity.Order;
import com.atguigu.orderservice.feginclient.CourseFegin;
import com.atguigu.orderservice.feginclient.UsersFegin;
import com.atguigu.orderservice.mapper.OrderMapper;
import com.atguigu.orderservice.service.OrderService;
import com.atguigu.util.edu.EduCourse;
import com.atguigu.util.ucenter.Member;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author hskBeginner
 * @since 2021-09-13
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderService orderService;
    @Autowired
    private CourseFegin courseFegin;
    @Autowired
    private UsersFegin usersFegin;

    @Transactional
    public String createOrders(String courseId,String memberId) {
        EduCourse courseInfo = courseFegin.getCourseInfo(courseId);
        Member member=usersFegin.getUserInfoOrder(memberId);
        Order order=new Order();
        order.setCourseId(courseId);
        order.setMemberId(memberId);
        orderService.save(order);
        return order.getId();
    }
}
