package beginning_of_everything1.springboot.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AnimePostRequestBody {
	@NotNull(message = "The anime name cannot be null")
	@NotBlank(message = "The anime cannot be blank")
	private String name;
}
