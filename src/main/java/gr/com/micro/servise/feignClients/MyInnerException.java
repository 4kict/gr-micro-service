package gr.com.micro.servise.feignClients;

public class MyInnerException extends RuntimeException {

    public MyInnerException(String message) {
        super(message);
    }
}
