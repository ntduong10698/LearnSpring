package com.bksoftwarevn.duongnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; // tạo resquest
import org.springframework.web.bind.annotation.RequestMethod;  // phương thức get, put, post

@Controller // anotation hiểu class này là controller
//khi nhận được resquest thì @Controller sẽ cho dispatcherServlet sẽ biết trong HelloController sẽ xử
//lý những resquest nào
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index"; // khi resquest đến / trả về index để xử lý ở servlet.xml cộng tiền tố hậu tố trả về file jsp đúng như trong đường dẫn ở WEB-INF
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
