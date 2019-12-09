package org.qhn.eurekaecho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaEchoApplication {

    //服务提供者eureka-echo
    public static void main(String[] args) {
        SpringApplication.run(EurekaEchoApplication.class, args);
    }

}
