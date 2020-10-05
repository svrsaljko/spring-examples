package rollaball.backend.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason="Username already exist!")
public class UserNameAlreadyExistException extends RuntimeException {}
