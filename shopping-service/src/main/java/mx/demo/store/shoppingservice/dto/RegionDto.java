package mx.demo.store.shoppingservice.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class RegionDto implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -6700067699609216808L;
	private Integer id;
	private String name;
}
