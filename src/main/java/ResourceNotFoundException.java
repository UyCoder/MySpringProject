/**
 * Project:     MySpringProject
 * Package:     PACKAGE_NAME
 * Created:     1/1/2022 16:37
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1 ;

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
