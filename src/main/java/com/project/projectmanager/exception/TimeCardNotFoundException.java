import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@RequestStatus(HttpStatus.NOT_FOUND) //404
public class TimeCardNotFoundException extends RuntimeException{

	 public TimeCardNotFoundException(){
		super("TimeCard Not Found");
		}
}