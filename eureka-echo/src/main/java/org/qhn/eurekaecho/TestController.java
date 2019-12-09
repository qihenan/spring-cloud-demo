package org.qhn.eurekaecho;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: qihenan
 * @Date: 2019/12/6 16:30
 * @Description:
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/echo")
    public String home(@RequestParam(value = "name") String name) {
        return "hello " + name + " ,this is port:" + port;
    }

}
