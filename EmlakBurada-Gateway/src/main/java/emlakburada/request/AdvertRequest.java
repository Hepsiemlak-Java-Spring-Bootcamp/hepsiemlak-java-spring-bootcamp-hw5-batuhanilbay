package emlakburada.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertRequest {
	
	private String title;
	private BigDecimal price;
	private int durationTime;

	
	

}
