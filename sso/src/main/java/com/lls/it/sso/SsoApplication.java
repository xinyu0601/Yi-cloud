package com.lls.it.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author stanley
 * @create 2019/11/16 12:16
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SsoApplication {

    public static void main(String args[]) {
        SpringApplication.run(SsoApplication.class, args);
    }

}
