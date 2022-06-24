package training.soap.boundary;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://auinger.de/GreetingWebService")
public interface GreetingWebService {

    @WebMethod
    String sayHello(String name);

}
