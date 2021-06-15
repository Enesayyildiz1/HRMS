package HRMSProject.HRMS.entities.concrete;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="educations")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
		private int id;
	@Column(name = "school_name")
	private String schoolName;
	@Column(name="department_name")
	private String departmentName;
	@Column(name="starting_date")
	private LocalDate startingDate;
	@Column(name="graduation_date")
	private LocalDate graduationDate;
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitae;
	
	
	public String getGraduationDate() {

		if (graduationDate == null) {
			return "Devam ediyor.";
		}

		return graduationDate.toString();
	}

}
