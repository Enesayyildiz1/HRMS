package HRMSProject.HRMS.entities.concrete;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int employeeId;
	
	@Column(name="name")
	private String employeeName;
	
	@Column(name="surname")
	private String employeeSurname;
	
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@Column(name="year_of_birth")
	private String yearOfBirth;
	@Column(name="re_password")
	
	private String rePassword;
	public Employee()
	{
	}
	public Employee(int employeeId, String employeeName, String employeeSurname, String nationalIdentity,
			String yearOfBirth, String rePassword) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.nationalIdentity = nationalIdentity;
		this.yearOfBirth = yearOfBirth;
		this.rePassword = rePassword;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSurname() {
		return employeeSurname;
	}
	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
}
