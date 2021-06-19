package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import HRMSProject.HRMS.entities.concrete.CurriculumVitae;
import HRMSProject.HRMS.entities.dtos.CvDtoForAllEntities;


public interface CurriculumVitaeDao  extends JpaRepository<CurriculumVitae,Integer>{
	CurriculumVitae getByCandidate_Id(int candidateId);
	                                                            
	
}
