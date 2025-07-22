package beginning_of_everything1.springboot.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AnimePostRequestBody {
	@NotEmpty(message = "The anime name cannot be empty")
	@NotNull(message = "The anime name cannot be null")
	private String name;
}
