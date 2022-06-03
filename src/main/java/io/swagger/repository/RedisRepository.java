package io.swagger.repository;

public interface RedisRepository {
    void save(String idempotencyKey, String paymentStatus);
    String findByKey(String key);
    boolean keyExist(String key);
    void remove(String key);
}