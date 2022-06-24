package training.soap.tiny;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.ZonedDateTime;

@WebService
public class TinyWebService {

    @WebMethod
    public String getDateTime() {
        return ZonedDateTime.now().toString();
    }
}
