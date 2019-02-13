package com.cbl.springPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/init")
    @ResponseBody
    public String init() {
        return "initialize successfully";
    }
    @RequestMapping("/init2")
    @ResponseBody
    public String init2() {
        TransactionDefinition tx;
        return "initialize successfully";
    }
}
