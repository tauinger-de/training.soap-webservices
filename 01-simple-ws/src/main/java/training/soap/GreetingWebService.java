package training.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class GreetingWebService {

    @WebMethod
    public String sayHello(String name) {
        return String.format("Hello, %s", name);
    }
}
