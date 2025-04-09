package com.lance.springboot.orderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "jifen-service")
public interface JiFenClient {

    @GetMapping(value = "/jifen/create")
    String createJifen(@RequestParam(name = "orderId") String orderId);

}
