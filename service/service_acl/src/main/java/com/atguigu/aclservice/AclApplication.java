package com.atguigu.aclservice;

import com.atguigu.serurity.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lj on 2021/2/17.
 * @version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.aclservice.mapper")
public class AclApplication {
    public static void main(String[] args) {
        User a=new User();

        a.setUsername("1");
        List list=new ArrayList();
        list.add(a);
        Stream objects = list.stream().map(s -> s.equals("1"));

        SpringApplication.run(AclApplication.class, args);
    }
}
