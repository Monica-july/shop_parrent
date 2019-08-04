package order.service.impl;

import common.base.BaseApiService;
import common.base.ResponseBase;
import order.service.MemberFeign;
import org.springframework.stereotype.Component;

@Component
public class MemberFeignImpl extends BaseApiService implements MemberFeign {
    @Override
    public ResponseBase test() {
        return setResultError("调用会员接口失败====");
    }
}
