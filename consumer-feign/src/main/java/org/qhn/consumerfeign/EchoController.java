package org.qhn.consumerfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: qihenan
 * @Date: 2019/12/6 16:56
 * @Description:
 */
@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo")
    public String sayHi(@RequestParam String name) {
        return echoService.echo( name );
    }

}
