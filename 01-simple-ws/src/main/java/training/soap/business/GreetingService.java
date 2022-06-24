package training.soap.business;

public class GreetingService {

    public GreetingService() {
        System.out.println("Constructing GreetingService");
    }

    public String createGreeting(String name) {
        if (name != null && name.length() > 0) {
            return "Hello, " + name;
        } else {
            return "Hi!";
        }
    }
}
