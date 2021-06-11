package HRMSProject.HRMS.entities.concrete;

import java.util.Date;
import java.util.List;

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
@Table(name="job_advertisements")
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="id")
		private int id;
	@Column(name="release_date")
	private Date releaseDate;
	@Column(name="description")
	private String description;
	@Column(name="max_salary")
	private String maxSalary;
	@Column(name="min_salary")
	private String minSalary;
	@Column(name="application_deadline")
	private Date applicationDeadline;
	@Column(name="open_position_amount")
	private String openPositionAmount;
	@Column(name="activation_status")
	private boolean activationStatus;
	@ManyToOne()
	@JoinColumn(name=("job_title_id"))
	private Position position;
	@ManyToOne()
	@JoinColumn(name=("employer_id"))
	private Employer employer;
	@ManyToOne()
	@JoinColumn(name=("city_id"))
	private City city;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
