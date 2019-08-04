package zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import zuul.filter.MyFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  //开启zuul
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }

    //开启过滤器
    @Bean
    public MyFilter myFilter(){
        return new MyFilter();
    }
}
