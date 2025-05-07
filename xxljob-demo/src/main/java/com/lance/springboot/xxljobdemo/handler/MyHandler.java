package com.lance.springboot.xxljobdemo.handler;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyHandler {
    @XxlJob("myJobHandler")
    public void say() {
        log.info("hi boy");
    }
}
