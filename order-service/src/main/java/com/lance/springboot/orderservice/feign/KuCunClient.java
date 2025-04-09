package com.lance.springboot.orderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "kucun-service")
public interface KuCunClient {

    @GetMapping(value = "/kucun/create")
    String createKucun(@RequestParam(name = "orderId") String orderId);

}
