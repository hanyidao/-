package com.ftt.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Application {
  /*  @Bean   //spring ioc当中不存在restTemplate的实例，所以在主类添加
    public RestTemplate restTemplate() {
        // 这次我们使用了OkHttp客户端,只需要注入工厂即可
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
    */

    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }
}
