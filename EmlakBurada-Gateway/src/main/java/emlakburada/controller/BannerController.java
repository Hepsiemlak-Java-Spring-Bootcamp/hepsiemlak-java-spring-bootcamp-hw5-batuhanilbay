package emlakburada.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.client.BannerOpenFeignClient;
import emlakburada.request.BannerRequest;
import emlakburada.response.BannerResponse;

@RestController
public class BannerController {
	
	
	@Autowired
	private BannerOpenFeignClient bannerClient;
	
	@GetMapping(value="/banners")
	public ResponseEntity<List<BannerResponse>> getAllBanner(){
		return bannerClient.getAllBanners();
		
	}
	
	

}
