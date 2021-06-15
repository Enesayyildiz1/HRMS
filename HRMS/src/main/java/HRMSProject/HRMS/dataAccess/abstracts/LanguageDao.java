package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMSProject.HRMS.entities.concrete.Language;

public interface LanguageDao  extends JpaRepository<Language,Integer>{

}
