package com.atguigu.orderservice.feginclient;

import com.atguigu.util.edu.EduCourse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "service-edu")
public interface CourseFegin {
@PostMapping("/eduservice/course/getCourseInfoOrder/{id}")
    public EduCourse getCourseInfo(@PathVariable("id") String id);
}
