package HRMSProject.HRMS.entities.concrete;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "curriculum_vitaes")
public class CurriculumVitae {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "creation_date")
	private LocalDate creationDate;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;


	@ManyToOne
	@JoinColumn(name = "cover_letter_id")
	private CoverLetter coverLetter;

	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Education> educations;

	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Experience> experiences;

	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<LanguageLevel> languageLevels;

	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Link> links;

	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Skill> skills;

}
