package com.aiassist.chatgpt.service;

import com.aiassist.chatgpt.constants.ModelConstants;
import com.aiassist.chatgpt.entity.ChatCompletionReq;
import com.theokanning.openai.completion.chat.ChatCompletionChoice;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@Service
@Slf4j
public class ChatServiceImpl implements ChatService{

    @Value("${proxy.chat.url}")
    private String proxyUrl;


    @Override
    public String complication(ChatCompletionReq chatCompletionReq) {
        log.info("请求参数{}",chatCompletionReq);
        RestTemplate client=new RestTemplate();
        String uri=proxyUrl+"";
        ChatCompletionRequest chatCompletionRequest =new ChatCompletionRequest();
        BeanUtils.copyProperties(chatCompletionReq,chatCompletionRequest);
        chatCompletionRequest.setModel(ModelConstants.chatComplication);
        ResponseEntity<ChatCompletionResult> responseEntity = client.postForEntity(uri, chatCompletionRequest, ChatCompletionResult.class);
        log.info("返回结果{}",responseEntity);
        ChatCompletionResult body = responseEntity.getBody();
        String text=body.getChoices().get(0).getMessage().getContent();
        return text;
    }

    @Override
    public List<ChatCompletionChoice> complicationList(ChatCompletionReq chatCompletionReq) {
        log.info("请求参数{}",chatCompletionReq);
        RestTemplate client=new RestTemplate();
        String uri=proxyUrl+"";
        ChatCompletionRequest chatCompletionRequest =new ChatCompletionRequest();
        BeanUtils.copyProperties(chatCompletionReq,chatCompletionRequest);
        chatCompletionRequest.setModel(ModelConstants.chatComplication);
        ResponseEntity<ChatCompletionResult> responseEntity = client.postForEntity(uri, chatCompletionRequest, ChatCompletionResult.class);
        log.info("返回结果{}",responseEntity);
        ChatCompletionResult body = responseEntity.getBody();
        List<ChatCompletionChoice> complicationList=body.getChoices();
        return complicationList;
    }
}
