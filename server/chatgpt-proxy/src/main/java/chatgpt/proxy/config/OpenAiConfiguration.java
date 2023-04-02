package chatgpt.proxy.config;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@Configuration
public class OpenAiConfiguration {

    @Value("${openai.token}")
    private String token;

    @Bean
    public OpenAiService getOpenAiService(){

        return new OpenAiService(token);
    }
}
