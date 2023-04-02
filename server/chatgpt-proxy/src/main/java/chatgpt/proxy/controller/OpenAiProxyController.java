package chatgpt.proxy.controller;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionResult;
import com.theokanning.openai.service.OpenAiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@Slf4j
@RestController
//@RequestMapping("/openai")
@Api(tags = "openai接口")
public class OpenAiProxyController {

    @Autowired
    OpenAiService openAiService;

    @Value("${openai.token}")
    private String token;

    @PostMapping("/gpt")
    @ApiOperation(value="对话接口" ,notes = "对话接口")
    public ChatCompletionResult openaiApiChat(@RequestBody ChatCompletionRequest param){
        log.info("请求参数{}",param);
        ChatCompletionResult chatCompletion = openAiService.createChatCompletion(param);
        log.info("返回数据{}",chatCompletion);
        return chatCompletion;
    }

}
