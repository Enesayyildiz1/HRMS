package HRMSProject.HRMS.entities.concrete;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "languages")
public class Language {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="language")
	private String language;
	@JsonIgnore
	@OneToMany(mappedBy = "language")
	private List<LanguageLevel> languageLevels;
}
