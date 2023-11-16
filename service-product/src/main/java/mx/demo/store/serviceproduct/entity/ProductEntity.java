package mx.demo.store.serviceproduct.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "tbl_products")
@Data
public class ProductEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8591130838578822478L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "El nombre del campo NO debe esrtar vacío")
	private String name;
	private String description;
	
	@Positive(message = "El stock debe ser mayor que '0'")
	private Double stock;
	private Double price;
	private String status;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;	
	
	// Una categoria tiene muchos products
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")	
	@NotNull(message = "La categoria NO debe ser NULL")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private CategoryEntity category;
}
