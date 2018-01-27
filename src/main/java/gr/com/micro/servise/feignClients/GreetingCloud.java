package gr.com.micro.servise.feignClients;

import org.springframework.web.bind.annotation.RequestMapping;


public interface GreetingCloud {
    @RequestMapping("/getGr")
    String greeting();
}
