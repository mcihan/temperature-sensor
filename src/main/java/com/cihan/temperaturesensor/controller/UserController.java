package com.cihan.temperaturesensor.controller;

import com.cihan.temperaturesensor.model.TemperatureConstant;
import com.cihan.temperaturesensor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    @ResponseBody
    @PostMapping(value = "/user")
    public User user(@RequestBody User request) {
        kafkaTemplate.send(TemperatureConstant.TOPIC, request);
        return request;
    }
}
