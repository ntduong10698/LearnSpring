package com.bksoftwarevn.duongnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ImgController {
    @RequestMapping(value = "/img", method = RequestMethod.GET)
    public String img() {
        System.out.println("img");
        return "windows_xp";
    }
}
