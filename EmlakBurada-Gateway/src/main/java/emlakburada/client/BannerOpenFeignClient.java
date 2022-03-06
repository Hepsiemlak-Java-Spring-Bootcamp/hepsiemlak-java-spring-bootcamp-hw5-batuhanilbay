package emlakburada.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import emlakburada.request.BannerRequest;
import emlakburada.response.BannerResponse;

@FeignClient(name="feign-banner",url="http://localhost:8081")
public interface BannerOpenFeignClient {
	
	
	@PostMapping(value="/banners")
	public ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest bannerRequest);
	
	@GetMapping(value="/banners")
	public ResponseEntity<List<BannerResponse>> getAllBanners();
		


}
