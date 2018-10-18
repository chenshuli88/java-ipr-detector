package com.ipr.detector;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <br/>
 *
 * @author chenshuli
 * @title 》WebApplication
 * @data 2018-10-16 20:48
 * @since 1.0.1
 */
@SpringBootApplication
@MapperScan("com.ipr.detector.dao")
@ComponentScan("com.ipr.detector.*")
public class DetectorWebApplication  {
    public static void main(String[] args) {
        SpringApplication.run(DetectorWebApplication.class, args);
    }
}
