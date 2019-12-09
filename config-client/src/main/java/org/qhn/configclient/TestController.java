package org.qhn.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: qihenan
 * @Date: 2019/12/6 17:40
 * @Description:
 */
@RestController
public class TestController {

    @Value("${name}")
    String name;

    @RequestMapping(value = "/getName")
    public String hi() {
        return "name:" + name;
    }

}
