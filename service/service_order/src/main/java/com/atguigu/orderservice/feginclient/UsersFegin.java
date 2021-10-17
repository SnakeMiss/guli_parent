package com.atguigu.orderservice.feginclient;

import com.atguigu.util.ucenter.Member;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(name = "service-ucenter")
public interface UsersFegin {

    @ApiOperation(value = "根据token获取会员信息")
    @GetMapping("getUserInfoOrder/{id}")
    public Member getUserInfoOrder(@PathVariable("id") String id);
}
