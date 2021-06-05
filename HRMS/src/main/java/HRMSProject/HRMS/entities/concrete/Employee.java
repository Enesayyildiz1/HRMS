package HRMSProject.HRMS.entities.concrete;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
public class Employee extends User{
	
	
	@Column(name="first_name")
	private String employeeName;
	
	@Column(name="last_name")
	private String employeeSurname;
	
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@Column(name="year_of_birth")
	private String yearOfBirth;
	
	
	
}
