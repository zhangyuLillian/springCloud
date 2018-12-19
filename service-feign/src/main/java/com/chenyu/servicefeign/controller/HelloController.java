package com.chenyu.servicefeign.controller;

import com.chenyu.servicefeign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @description
 * @date 2018/12/12 13:40
 */
@RestController
public class HelloController {
    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @GetMapping(value = "/sayHi")
    public String sayHi(@RequestParam String name) {
        return scheduleServiceHi.sayHelloFromClientOne( name );
    }

}
