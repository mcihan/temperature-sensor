package com.cihan.temperaturesensor.service;

import com.cihan.temperaturesensor.model.TemperatureConstant;
import com.cihan.temperaturesensor.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author cihan dogan  on 23.08.2021
 */

@Component
@Slf4j
public class TemperatureConsumer {

    @KafkaListener(topics = TemperatureConstant.TOPIC)
    public void consumeTemperature(User user) {
        log.info("consumed Temperature --> {}" + user.toString());
    }
}
