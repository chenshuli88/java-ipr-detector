package com.ipr.detector.controller.test;

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


    @GetMapping("list")
    public ApiResponse list(){
        return ApiResponse.create().setData(testService.getById(1111));
    }
}
