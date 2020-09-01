
package com.stocks.loginservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginPage {

    @RequestMapping({"/hello"})
    public String hello(){
        return "Hello World";
    }    
}