package com.lance.springboot.orderservice.controller;

import com.lance.springboot.orderservice.feign.JiFenClient;
import com.lance.springboot.orderservice.feign.KuCunClient;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/order")
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private KuCunClient kuCunClient;

    @Autowired
    private JiFenClient jiFenClient;

    @GetMapping("/create")
    public String createOrder(@RequestParam(name = "orderId") String orderId) {

        //String kucunResult = restTemplate.getForObject("http://localhost:8081/kucun/create?orderId=" + orderId, String.class);
        //String jifenResult = restTemplate.getForObject("http://localhost:8082/jifen/create?orderId=" + orderId, String.class);
        //String jifenResult = restTemplate.getForObject("http://jifen-service/jifen/create?orderId=" + orderId, String.class);

        kuCunClient.createKucun(orderId);
        jiFenClient.createJifen(orderId);

        String s = "创建 订单 成功";
        log.info(s);
        return s;
    }

}
