package emlakburada.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import emlakburada.request.AdvertRequest;
import emlakburada.response.AdvertResponse;

@FeignClient(name="feign-advert",url="http://localhost:8080")
public interface AdvertOpenFeignClient {
	
	@PostMapping(value="/adverts")
	public ResponseEntity<AdvertResponse> saveAdvert(@RequestBody AdvertRequest advertRequest);
	
	@GetMapping(value="/adverts")
	public ResponseEntity<List<AdvertResponse>> getAllAdverts();
		
	
	
	
	

}
