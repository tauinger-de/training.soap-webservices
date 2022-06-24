package training.soap.boundary;

import javax.jws.WebService;

@WebService(
        serviceName = "GreetingWebService",
        endpointInterface = "training.soap.boundary.GreetingWebService"
)
public class GreetingWebServiceImpl implements GreetingWebService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
