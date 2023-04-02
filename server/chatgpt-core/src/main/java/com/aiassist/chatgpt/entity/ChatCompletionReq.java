package com.aiassist.chatgpt.entity;

import com.theokanning.openai.completion.chat.ChatMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@ApiModel("对话")
public class ChatCompletionReq {

    @ApiModelProperty("对话列表")
    List<ChatMessage> messages;

    @ApiModelProperty("首次开启对话角色")
    String role;

}
