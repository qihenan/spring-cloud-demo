package org.qhn.consumerfeign;

import org.springframework.stereotype.Component;

/**
 * @Auther: qihenan
 * @Date: 2019/12/6 17:18
 * @Description:
 */
@Component
public class EchoServiceHystric implements EchoService {

    @Override
    public String echo(String name) {
        return "sorry service is error;";
    }

}
