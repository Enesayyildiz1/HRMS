package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMSProject.HRMS.entities.concrete.LanguageLevel;

public interface LanguageLevelDao  extends JpaRepository<LanguageLevel,Integer>{

}
