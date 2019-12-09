package org.qhn.eurekaechorepeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaEchoRepeatApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaEchoRepeatApplication.class, args);
    }

}
