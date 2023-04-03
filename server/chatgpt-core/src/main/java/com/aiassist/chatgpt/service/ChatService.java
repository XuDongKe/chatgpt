package com.aiassist.chatgpt.service;

import com.aiassist.chatgpt.entity.ChatCompletionReq;
import com.theokanning.openai.completion.chat.ChatCompletionChoice;

import java.util.List;

public interface ChatService {

    String complication(ChatCompletionReq chatCompletionReq);

    List<ChatCompletionChoice> complicationList(ChatCompletionReq chatCompletionReq);
}
