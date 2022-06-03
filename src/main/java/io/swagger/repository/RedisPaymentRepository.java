package io.swagger.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisPaymentRepository implements RedisRepository{

    private final RedisTemplate<String, String> template;

    public RedisPaymentRepository(@Qualifier("redisTemplate") RedisTemplate<String, String> template) {
        this.template = template;
    }

    @Override
    public void save(String idempotencyKey, String paymentStatus) {
        template.opsForValue().set(idempotencyKey, paymentStatus);
        template.expire(idempotencyKey,60, TimeUnit.MINUTES);
    }

    @Override
    public String findByKey(String key) {
        return template.opsForValue().get(key);
    }

    @Override
    public boolean keyExist(String key) {
        return Boolean.TRUE.equals(template.hasKey(key));
    }

    @Override
    public void remove(String key) {
        template.delete(key);
    }
}
