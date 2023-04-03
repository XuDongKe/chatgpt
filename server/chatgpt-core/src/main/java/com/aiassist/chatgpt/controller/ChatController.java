package com.aiassist.chatgpt.controller;

import com.aiassist.chatgpt.entity.ChatCompletionReq;
import com.aiassist.chatgpt.entity.Result;
import com.aiassist.chatgpt.service.ChatService;
import com.alibaba.fastjson2.JSONObject;
import com.theokanning.openai.completion.chat.ChatCompletionChoice;
import com.theokanning.openai.completion.chat.ChatMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@Slf4j
@RestController
//@RequestMapping("")
@Api(tags = "chatgpt-3.5对话接口")
public class ChatController {

    @Autowired
    ChatService chatService;

    @PostMapping("/complication/3.5")
    @ApiOperation("对话接口")
    public Result<String> limitChat(@RequestBody ChatCompletionReq chatCompletionReq){
        String complication = chatService.complication(chatCompletionReq);
        return Result.success(complication);
    }

    @PostMapping("/complication/3.5/list")
    @ApiOperation("对话接口")
    public HashMap<String,List> limitChatList(@RequestBody ChatCompletionReq chatCompletionReq){
        List<ChatCompletionChoice> list=chatService.complicationList(chatCompletionReq);
        HashMap map= new HashMap();
        map.put("choices",list);
        return map;

    }
    @PostMapping("/gpt")
    @Deprecated
    @ApiOperation("单条回复")
    public String get(@RequestBody JSONObject prompt, HttpServletResponse response){
        log.info("请求参数{}",prompt);
        ChatCompletionReq chatCompletionReq =new ChatCompletionReq();
        List<ChatMessage> messageList =new ArrayList<ChatMessage>();
        ChatMessage chatMessage =new ChatMessage();
        chatMessage.setContent(prompt.getString("prompt"));
        chatMessage.setRole("user");
        messageList.add(chatMessage);
        chatCompletionReq.setMessages(messageList);
        //chatCompletionReq.set
        String complication = chatService.complication(chatCompletionReq);
        log.info("返回数据{}",complication);
        return complication;
    }


}
