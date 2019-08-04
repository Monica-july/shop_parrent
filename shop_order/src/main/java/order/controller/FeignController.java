package order.controller;

import common.base.ResponseBase;
import order.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    @Qualifier("memberFeignImpl")
    MemberFeign memberFeign;

    @RequestMapping("/sf")
    public ResponseBase testFeign(){
        return memberFeign.test();
    }
}
