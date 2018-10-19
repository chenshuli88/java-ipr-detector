package com.ipr.detector.controller.test;

import com.ipr.detector.base.redis.RedisService;
import com.ipr.detector.base.utils.ApiResponse;
import com.ipr.detector.service.test.ITestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <br/>
 *
 * @author chenshuli
 * @title 》TestController
 * @data 2018-10-16 21:09
 * @since 1.0.1
 */
@RestController
@RequestMapping("/test/*")
public class TestController {

    @Resource
    private ITestService testService;
    @Resource
    private RedisService redisService;

    @GetMapping("list")
    public ApiResponse list() {
        String key = "count_sum";
        Integer i = 0;
        if (redisService.hasKey(key)) {
            String value = redisService.get(key);
            i=Integer.valueOf(value)+1;
            redisService.set(key,i.toString());
        }else {
            i+=1;
            redisService.set(key,i.toString());
        }
        return ApiResponse.create().setData(testService.getById(1111)).setMsg(i.toString());
    }
}
