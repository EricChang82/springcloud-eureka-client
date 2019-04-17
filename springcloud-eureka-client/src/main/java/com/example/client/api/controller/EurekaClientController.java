package com.example.client.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
     
    @Value("${server.port}")
    private String port;
 
    /**
     *@author changle
     *Create Time: 2019年4月16日 
     *Purpose:提供的一个restful服务，返回内容格式：服务协议://服务器地址:服务端口/服务uri
     */
    @RequestMapping("/info")
    public String info(HttpServletRequest request) {
        String message = "这是客户端："+request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getServletPath();
        return message;
    }
}