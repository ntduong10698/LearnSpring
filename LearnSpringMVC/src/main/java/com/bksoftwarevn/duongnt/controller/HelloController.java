package com.bksoftwarevn.duongnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; // tạo resquest
import org.springframework.web.bind.annotation.RequestMethod;  // phương thức get, put, post

//luồng của spring khi nhận một request với web.xml với sevlet.xml và controller
//phân biệt url và uri
//test với restcontroller và resquestbody
//so sánh pathvariable và resquest param
//Model trong java

@Controller // anotation hiểu class này là controller
//khi nhận được resquest thì @Controller sẽ cho dispatcherServlet sẽ biết trong HelloController sẽ xử
//lý những resquest nào

//ResquestMapping được áp dụng với controller class hoặc method trong controller class;
public class HelloController {
    @RequestMapping(value = {"/", "/home"}) // chấp nhận xử lý 2 request trong mảng là "/" hoặc "/home"
    public String index() {
        System.out.println("index");
        return "index"; // khi resquest đến / trả về index để xử lý ở servlet.xml cộng tiền tố hậu tố trả về file jsp đúng như trong đường dẫn ở WEB-INF
    }

    //nếu không dùng method thì mặc định cho tất cả get, post, put, delete
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    //đối với resquest phải chứa cặp giá trị header name-NguyenDuong thì mới được response, nếu có nhiều thì phải
    //đáp ứng đủ name-NguyenDuong và id-1, thường dùng để bảo mật api
    @RequestMapping(value = "/test-header", headers = {"name=NguyenDuong", "id=1"})
    public String testHeader() {
        System.out.println("test-header");
        return "hello";
    }

    //chỉ chấp nhận kiểu produces là ứng dụng kiểu json hoặc xml hay sử dụng với rest-api
    //consumes chấp nhận content-type cùng kiểu
    //sảy ra lỗi Unsupported Media Type sai kiểu
    //content-type hay consumes sẽ là quy định ở phần headers giống nhu key-value ở phần header.
    @RequestMapping(value = "/test-json", produces = {"application/json", "application/xml"}, consumes = "text/html")
    public String testJson() {
        System.out.println("test-json");
        return "hello";
    }
}
