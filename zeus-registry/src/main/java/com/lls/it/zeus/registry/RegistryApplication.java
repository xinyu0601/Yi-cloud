package com.lls.it.zeus.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author stanley
 * @create 2019/11/16 0:23
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

    public static void main(String args[]) {
        SpringApplication.run(RegistryApplication.class, args);
    }

}
