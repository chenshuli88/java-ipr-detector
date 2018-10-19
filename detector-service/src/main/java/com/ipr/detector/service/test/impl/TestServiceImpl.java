package com.ipr.detector.service.test.impl;

import com.ipr.detector.dao.ITestDao;
import com.ipr.detector.dataobject.trademark.Trademark;
import com.ipr.detector.service.test.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <br/>
 *
 * @author chenshuli
 * @title 》TestServiceImpl
 * @data 2018-10-16 21:12
 * @since 1.0.1
 */
@Service
public class TestServiceImpl implements ITestService {
    @Resource
    private ITestDao iTestDao;


    @Override
    public Trademark getById(Integer id) {
        if (id == null && id <= 0) {
            return null;
        }
        return iTestDao.getById(id);
    }
}
