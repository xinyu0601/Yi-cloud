package com.lls.it.zeus.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author stanley
 * @create 2019/11/16 0:23
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayApplication {

    public static void main(String args[]) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
