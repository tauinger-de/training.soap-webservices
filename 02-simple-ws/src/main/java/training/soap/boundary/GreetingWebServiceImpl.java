package training.soap.boundary;

import training.soap.business.GreetingService;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(
        serviceName = "GreetingWebService",
        endpointInterface = "training.soap.boundary.GreetingWebService"
)
public class GreetingWebServiceImpl implements GreetingWebService {

    @Inject
    private GreetingService greetingService;

    @Override
    public String sayHello(String name) {
        return greetingService.createGreeting(name);
    }
}
