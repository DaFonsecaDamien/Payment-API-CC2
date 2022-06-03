package io.swagger.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisPaymentRepository implements RedisRepository{

    @Qualifier("redisTemplate")
    @Autowired
    private RedisTemplate template;

    @Override
    public void save(String idempotencyKey, String paymentStatus) {
    }

    @Override
    public String findByKey(String key) {
        return null;
    }

    @Override
    public boolean keyExist(String key) {
        return false;
    }

    @Override
    public void remove(String key) {

    }
}
