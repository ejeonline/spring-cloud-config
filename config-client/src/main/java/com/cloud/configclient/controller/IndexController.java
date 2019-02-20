package com.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyingjie
 * @Title: HelloController
 * @Description: aaa
 * @date 2019/2/20
 */
@RestController
public class IndexController {

    @Value("${jay.label}")
    private String label;

    @RequestMapping("/helloConfig")
    public String helloConfig(){
        System.out.println("configClient");
        return label+" hello config client";
    }

}
