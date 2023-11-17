package mx.demo.store.servicecustomer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_customers")
public class CustomerEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2402336656154492954L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "El campo numberID NO puede estar vacío")
	@Size(min = 8, max = 8, message = "La longitud del campo numberID debe ser de 8 caracteres")
	@Column(name = "number_id", unique = true, length = 8, nullable = false)
	private String numberID;
	
	@NotEmpty(message = "El campo firstName NO puede estar vacío")
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@NotEmpty(message = "El campo lastName NO puede estar vacío")
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@NotEmpty(message = "El campo email NO puede estar vacío")
	@Email(message = "El email NO es un correo de formato valido")
	@Column(name = "email", nullable = false)
	private String email;
	
	@NotNull(message = "La region NO puede ser NULL")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private RegionEntity region; 
	
	private String state;

}
