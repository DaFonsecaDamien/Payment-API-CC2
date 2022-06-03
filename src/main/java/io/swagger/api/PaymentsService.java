package io.swagger.api;

import io.swagger.model.Payment;
import io.swagger.repository.RedisPaymentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentsService {

    private final RedisPaymentRepository redisPaymentRepository;

    public PaymentsService(final RedisPaymentRepository redisPaymentRepository) {
        this.redisPaymentRepository = redisPaymentRepository;
    }

    public String makePayments(Payment payment, String key) {
        if (!redisPaymentRepository.keyExist(key)) {
            redisPaymentRepository.save(key, "pending since: " + LocalDateTime.now());
        }

        return redisPaymentRepository.findByKey(key);
    }
}
