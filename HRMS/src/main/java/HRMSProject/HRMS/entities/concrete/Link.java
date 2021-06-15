package HRMSProject.HRMS.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "links")
public class Link {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;


	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitae;
}
