package com.aiassist.chatgpt.controller;

import com.aiassist.chatgpt.entity.ChatCompletionReq;
import com.aiassist.chatgpt.entity.Result;
import com.aiassist.chatgpt.service.ChatService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ChatService chatService;

    @PostMapping("/complication/3.5")
    public Result<String> limitChat(@RequestBody ChatCompletionReq chatCompletionReq){
        String complication = chatService.complication(chatCompletionReq);
        return Result.success(complication);
    }

}
