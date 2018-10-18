package com.ipr.detector.dao;

import com.ipr.detector.entity.trademark.Trademark;


/**
 * <br/>
 *
 * @author chenshuli
 * @title 》ITestDao
 * @data 2018-10-18 13:36
 * @since 1.0.1
 */

public interface ITestDao {
    Trademark getById(Integer id);
}
