package mx.demo.store.shoppingservice.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class ProductDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4451081728645711230L;
	private float id;
	  private String name;
	  private String description;
	  private float stock;
	  private float price;
	  private String status;
	  private String createAt;
	  private CategoryDto category;
}
