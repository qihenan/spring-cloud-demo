package org.qhn.eurekaserverrepeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRepeatApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerRepeatApplication.class, args);
    }

}
