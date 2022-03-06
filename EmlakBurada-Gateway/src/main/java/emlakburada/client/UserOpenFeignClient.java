package emlakburada.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import emlakburada.request.UserRequest;
import emlakburada.response.UserResponse;

@FeignClient(name="feign-user",url="http://localhost:8080")

public interface UserOpenFeignClient {

	
	@PostMapping(value="/users")
	public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest);
	
	@GetMapping(value="/users")
	public ResponseEntity <List<UserResponse>> getAllUsers();
}
