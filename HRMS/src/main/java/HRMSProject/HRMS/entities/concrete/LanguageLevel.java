package HRMSProject.HRMS.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "language_levels")
public class LanguageLevel {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="language_level")
	private int languageLevel;
	@ManyToOne()
	@JoinColumn(name=("language_id"))
	private Language language;
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitae;
	
}
