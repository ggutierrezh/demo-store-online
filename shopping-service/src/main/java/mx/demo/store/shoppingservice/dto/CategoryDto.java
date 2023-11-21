package mx.demo.store.shoppingservice.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class CategoryDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3219632526711153076L;
	private float id;
	private String name;
}
