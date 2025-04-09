package com.lance.springboot.jifenservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/jifen")
@Slf4j
public class JiFenController {

    @GetMapping("/create")
    public String createJifen(@RequestParam(name = "orderId") String orderId) {
        String s = "创建 积分 成功";
        log.info(s);
        return s;
    }

}

