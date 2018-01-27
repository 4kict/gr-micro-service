package gr.com.micro.servise.controller;

import gr.com.micro.servise.feignClients.GreetingCloud;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GrController implements GreetingCloud {

    private Random random = new Random();

    @Override
    public String greeting() {
        return "Hello From Cloud MicroService rnd=" + random.nextFloat();
    }
}

