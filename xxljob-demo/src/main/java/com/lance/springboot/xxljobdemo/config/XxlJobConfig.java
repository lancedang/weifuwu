package com.lance.springboot.xxljobdemo.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class XxlJobConfig {

    @Value("${xxl.job.admin.addresses}")
    String address;
    @Value("${xxl.job.executor.appname}")
    String appName;
    @Value("${xxl.job.admin.accessToken}")
    String accessToken;

    @Value("${xxl.job.executor.port}")
    int port;

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        XxlJobSpringExecutor executor = new XxlJobSpringExecutor();
        //executor.setAddress(address);
        //区分address和admin address
        executor.setAdminAddresses(address);
        executor.setAppname(appName);
        executor.setPort(port);

        executor.setAccessToken(accessToken);

        return executor;
    }
}
