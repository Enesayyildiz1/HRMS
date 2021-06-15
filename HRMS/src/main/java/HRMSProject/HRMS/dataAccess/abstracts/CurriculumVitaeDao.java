package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import HRMSProject.HRMS.entities.concrete.CurriculumVitae;
import HRMSProject.HRMS.entities.dtos.CvDtoForAllEntities;


public interface CurriculumVitaeDao  extends JpaRepository<CurriculumVitae,Integer>{
	CurriculumVitae getByEmployee_Id(int employeeId);
	@Query("Select new HRMSProject.HRMS.entities.dtos.CvDtoForAllEntities(cv.id,cv.creationDate,cv.employee,cv.coverLetter,e.schoolName) From Education e Inner Join e.curriculumVitae cv")                                                            
	CvDtoForAllEntities getDtosByEmployee_Id(int employeeId);
}
