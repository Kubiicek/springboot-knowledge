package beginning_of_everything1.springboot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor
public class ValidationExceptionDetails extends ExceptionDetails{
	private final String fields;
	private final String fieldsMessage;
}
