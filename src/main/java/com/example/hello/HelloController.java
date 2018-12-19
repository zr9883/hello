package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zr
 * @ClassName: HelloController
 * @Description: TODO
 * @date 2018/12/18 14:39
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello,Jenkins!www";
    }
}
