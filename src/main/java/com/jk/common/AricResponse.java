package com.jk.common;

/**
 * @ClassNam AricResponse
 * @Description TODO
 * @Author 红旗
 * @Date 2018/10/15 21:44
 * Version 1.0
 **/
/**
 * 服务端向浏览器发送的消息
 */
public class AricResponse {

    private String responseMessage;

    public AricResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

}
