package gr.com.micro.servise.controller;

//import gr.com.micro.service.api.GrMicroServiceClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrController {
        //implements GrMicroServiceClient {

    @RequestMapping(path = "/getGr")
    public String getGr(){
        return "Some Data from Micro service";
    }

//    @Override
    public String getInfo() {
        return "My Name is MICRO-SERVICE";
    }
}
