package emlakburada.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import emlakburada.client.AdvertOpenFeignClient;
import emlakburada.response.AdvertResponse;

@RestController

public class AdvertController {
	
	@Autowired
	private AdvertOpenFeignClient advertClient;
	
	
	@GetMapping(value="/adverts")
	public ResponseEntity<List<AdvertResponse>> getAllAdverts(){
		return advertClient.getAllAdverts();
		
	}
	

	
	



}
