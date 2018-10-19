package com.ipr.detector.base.redis;

import java.util.List;

/**
 * <br/>
 *
 * @author chenshuli
 * @title 》RedisService
 * @data 2018-10-19 13:47
 * @since 1.0.1
 */
public interface RedisService {
    boolean set(final String key, final String value);

    String get(final String key);

    boolean expire(final String key, long expire);

    <T> boolean setList(String key, List<T> list);

    <T> List<T> getList(String key, Class<T> clz);

    long lpush(String key, Object obj);

    long rpush(String key, Object obj);

    String lpop(String key);

    boolean hasKey(String key);
}
