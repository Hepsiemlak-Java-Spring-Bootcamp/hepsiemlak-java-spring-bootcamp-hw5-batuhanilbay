package emlakburada.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserResponse {

	
	private String name;
	private String email;
	private String photo;
	private String bio;
}
