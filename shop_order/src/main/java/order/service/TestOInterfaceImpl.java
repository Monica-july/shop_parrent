package order.service;

import common.base.BaseApiService;
import common.base.ResponseBase;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOInterfaceImpl extends BaseApiService implements ITestOInterface{
    @Override
    public ResponseBase testo() {
        return setResultError("订单接口方法");
    }
}
