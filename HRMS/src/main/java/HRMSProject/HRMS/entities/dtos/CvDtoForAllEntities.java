package HRMSProject.HRMS.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import HRMSProject.HRMS.entities.concrete.CoverLetter;
import HRMSProject.HRMS.entities.concrete.Education;
import HRMSProject.HRMS.entities.concrete.Employee;
import HRMSProject.HRMS.entities.concrete.Experience;
import HRMSProject.HRMS.entities.concrete.Image;
import HRMSProject.HRMS.entities.concrete.LanguageLevel;
import HRMSProject.HRMS.entities.concrete.Link;
import HRMSProject.HRMS.entities.concrete.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDtoForAllEntities {

	private int id;

	private LocalDate creationDate;

	private Employee employee;

	private CoverLetter coverLetter;

	private String educationName;

	

}
