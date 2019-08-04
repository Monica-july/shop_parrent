package order.service;

import common.base.ResponseBase;
import order.service.impl.MemberFeignImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
//name为被调用的服务名称
//fallback为失败调用
@FeignClient(name = "service-member",fallback = MemberFeignImpl.class)
public interface MemberFeign {
    //直接在方法上添加被调用的服务路径
    @RequestMapping("/member/mtest")
    ResponseBase test();
}
