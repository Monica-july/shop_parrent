package order.service;

import common.base.ResponseBase;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
public interface ITestOInterface {
    @RequestMapping("/otest")
    ResponseBase testo();
}
