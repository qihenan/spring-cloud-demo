package org.qhn.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
//@EnableZipkinServer
public class ServerZipkinApplication {

    //不需要Application，直接运行java -jar ： java -jar zipkin-server-2.12.2-exec.jar命令启动
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }

}
