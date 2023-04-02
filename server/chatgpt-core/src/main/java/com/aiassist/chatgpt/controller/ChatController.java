package com.aiassist.chatgpt.controller;

import com.aiassist.chatgpt.entity.ChatCompletionReq;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@Slf4j
@RestController
@RequestMapping("/chat")
@Api(tags = "chatgpt-3.5对话接口")
public class ChatController {

    @PostMapping("/complication/3.5")
    public void limitChat(@RequestBody ChatCompletionReq chatCompletionReq){

    }

}
