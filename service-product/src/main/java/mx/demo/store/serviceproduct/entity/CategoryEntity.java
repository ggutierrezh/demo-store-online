package mx.demo.store.serviceproduct.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_categories")
@Data
public class CategoryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2470151574155853147L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	
	private String name;
}
