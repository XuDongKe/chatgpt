package com.aiassist.chatgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ChatGPTApplication {
    public static void main(String[] arg0){
        SpringApplication.run(ChatGPTApplication.class,arg0);
    }
}
