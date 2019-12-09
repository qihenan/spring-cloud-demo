package org.qhn.consumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: qihenan
 * @Date: 2019/12/6 16:57
 * @Description:
 */
@FeignClient(value = "eureka-echo",fallback = EchoServiceHystric.class)//value值是指定调用哪个服务
public interface EchoService {

    //value值是指定调用那个方法
    @RequestMapping(value = "/echo",method = RequestMethod.GET)
    String echo(@RequestParam(value = "name") String name);

}
