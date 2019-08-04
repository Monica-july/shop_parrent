package member.service;

import common.base.BaseApiService;
import common.base.ResponseBase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestInterfaceImpl extends BaseApiService implements ITestInterface{
    int count = 0;
    @Override
    public ResponseBase test() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println("count====="+count);
        return setResultError("会员接口方法======"+count);
    }

    @Override
    public ResponseBase testFilter(@RequestParam String token) {
        return setResultSuccess(token);
    }
}
