package org.qhn.consumerribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: qihenan
 * @Date: 2019/12/6 16:36
 * @Description:
 */
@Service
public class EchoService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String echo(String name) {
//        需要使用ribbon实现负载均衡的时候，服务名称不能用下划线EUREKA_ECHO，换成中划线EUREKA-ECHO
//        使用了负载均衡,所有的访问就必须以应用名访问，也就是生产者注册在Eureka中的ID,不能使用url进行请求
        return restTemplate.getForObject("http://EUREKA-ECHO/echo?name=" + name, String.class);
    }

    //    调用http://localhost:8004/echo?name=kyle，发现可以在两个服务之间切换。然后停掉其中一个eureka-echo服务，
    // 刚开始可能会返回"hi,kyle,Service is error!"，然后不会再去访问该服务，而去调用集群中的其他服务
    public String error(String name) {
        return "hi," + name + ",Service is error!";
    }

}
