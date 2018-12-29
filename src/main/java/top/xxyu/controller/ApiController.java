package top.xxyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api")
public class ApiController {


    @RequestMapping("/index")
    public String index(){
        System.out.println("asdf");
        return "index222333";
    }
}
