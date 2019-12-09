package org.qhn.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {

    //构建server-zipkin，只需要从网上下载jar包运行即可。https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }

}
