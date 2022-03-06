package emlakburada.response;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertResponse {

	private int advertNo;
	private String title;
	private BigDecimal price;
	private int durationTime;
	

}
