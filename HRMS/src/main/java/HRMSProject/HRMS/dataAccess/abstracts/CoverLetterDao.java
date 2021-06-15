package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.CoverLetter;


public interface CoverLetterDao  extends JpaRepository<CoverLetter,Integer>{

}
