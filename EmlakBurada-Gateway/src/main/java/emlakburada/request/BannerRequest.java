package emlakburada.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class BannerRequest {
	
	
	private int advertNo;
	private String phone;
	private int total;

}
