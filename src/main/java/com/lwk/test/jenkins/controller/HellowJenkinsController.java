package com.lwk.test.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jenkins")
public class HellowJenkinsController {


    @GetMapping("/test")
    @ResponseBody
    public String test(){

        return "hellow jenkins";
    }

}
