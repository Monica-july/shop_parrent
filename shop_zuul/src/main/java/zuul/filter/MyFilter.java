package zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import common.util.StringUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter {
    //pre 路由之前   routing路由之时   post路由之后   error错误调用
    @Override
    public String filterType() {
        return "pre";
    }

    //优先级
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String tokenparam = request.getParameter("token");
        //token不为空 正确跳转
        if (!StringUtil.isEmpty(tokenparam)){
            System.out.println("============"+tokenparam+"==========");
            return null;
        }
        System.out.println("========token为空=======");
        //响应失败
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            ctx.getResponse().getWriter().print("token is null");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
