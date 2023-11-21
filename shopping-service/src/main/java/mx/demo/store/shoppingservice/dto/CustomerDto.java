package mx.demo.store.shoppingservice.dto;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Builder
@Data
public class CustomerDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3674131857147827220L;
	private Integer id;
    private String numberID;
    private String firstName;
    private String lastName;
    private String email;
    private RegionDto region;
    private String state;

}
