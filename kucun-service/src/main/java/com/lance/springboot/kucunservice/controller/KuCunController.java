package com.lance.springboot.kucunservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kucun")
@Slf4j
public class KuCunController {

    @GetMapping("/create")
    public String createKucun(@RequestParam(name = "orderId") String orderId) {
        String s = "创建 库存 成功";
        log.info(s);
        return s;
    }

}
