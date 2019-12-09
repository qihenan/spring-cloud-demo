package org.qhn.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        //在启动config-server后，访问http://localhost:9000/kyle/pro/master   如果得到返回，则说明配置服务中心可以从远程程序获取配置信息。
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
