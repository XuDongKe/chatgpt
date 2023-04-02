package chatgpt.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProxyApplication {
    public static void main(String[] arg0){
        SpringApplication.run(ProxyApplication.class,arg0);
    }
}
