package com.chenyu.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangyu
 * @description
 * @date 2018/12/12 13:36
 */
@FeignClient(value = "eureka-client",fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
