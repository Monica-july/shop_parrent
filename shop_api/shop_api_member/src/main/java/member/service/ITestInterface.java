package member.service;

import common.base.ResponseBase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/member")
public interface ITestInterface{
    @RequestMapping("/mtest")
    ResponseBase test();
    @RequestMapping("/ftest")
    ResponseBase testFilter(@RequestParam String token);
}
