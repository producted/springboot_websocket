package com.jk.controller;

/**
 * @ClassNam WebSocketController
 * @Description TODO
 * @Author 红旗
 * @Date 2018/10/15 21:48
 * Version 1.0
 **/

import com.jk.common.AricMessage;
import com.jk.common.AricResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * webSocket控制器
 */
@Controller
public class WebSocketController {

    @MessageMapping("/welcome") //当浏览器向服务端发送请求时,通过@MessageMapping映射/welcome这个地址,类似于@ResponseMapping
    @SendTo("/topic/getResponse")//当服务器有消息时,会对订阅了@SendTo中的路径的浏览器发送消息
    public AricResponse say(AricMessage message) {
        try {
            //睡眠1秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AricResponse("welcome," + message.getName() + "!");
    }
}
