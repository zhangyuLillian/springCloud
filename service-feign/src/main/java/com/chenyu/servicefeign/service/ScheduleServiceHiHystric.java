package com.chenyu.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author zhangyu
 * @description
 * @date 2018/12/19 14:05
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi{
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry " + name;
    }
}
