package com.gl.SpringKafkaProducer.controller;

import com.gl.SpringKafkaProducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("kafka-producer")
public class ResourceController {

    @Resource
    private KafkaTemplate<String, User> namekafkaTemplate;

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC="kafka-example";

    private static final String TOPIC_User="kafka-example-userDetails";

    @RequestMapping(value = "/publishMsg/{msg}", method= RequestMethod.GET)
    public String publishMsg(@PathVariable("msg") String msg){
        kafkaTemplate.send(TOPIC,msg) ;
     return "published Successfully";
    }

    @RequestMapping(value = "/publish", method= RequestMethod.POST)
    public String publishUserDetails(@RequestBody User user){
        namekafkaTemplate.send(TOPIC_User,user) ;
        return "published Successfully";
    }
}
