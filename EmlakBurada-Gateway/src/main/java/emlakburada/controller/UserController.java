package emlakburada.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.client.UserOpenFeignClient;
import emlakburada.response.UserResponse;

@RestController
public class UserController {
	
	@Autowired
	private UserOpenFeignClient userClient;
	
	@GetMapping(value="/users")
	public ResponseEntity<List<UserResponse>> getAllUsers(){
		return userClient.getAllUsers();
		
	}

}
