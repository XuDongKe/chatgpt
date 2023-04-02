package com.aiassist.chatgpt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 5771573916446596671L;

    private static int SUCCESS = 0;
    private static int FAIL = -1;
    private static String MSG_SUCCESS = "成功";
    private static String MSG_FAIL = "失败";

    int code;

    String message;

    T data;

    public static <T> Result<T> success(T data) {
        return new Result(SUCCESS, MSG_SUCCESS, data);
    }

    public static <T> Result<T> success(String message, T data) {
        message = message != null && message.length() > 0 ? message : MSG_SUCCESS;
        return new Result(SUCCESS, message, data);
    }

    public static <T> Result<T> fail(T data) {
        return new Result(FAIL, MSG_FAIL, data);
    }

    public static <T> Result<T> fail(int code,String message,T data) {
        return new Result(code,  message, data);
    }

    public static <T> Result<T> fail(String message, T data) {
        message = message != null && message.length() > 0 ? message : MSG_FAIL;
        return new Result(FAIL, message, data);
    }

}
