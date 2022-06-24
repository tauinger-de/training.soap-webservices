package training.soap.boundary;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://auinger.de/GreetingWebService")
public interface GreetingWebService {

    @WebMethod
    String sayHello(String name);

}
