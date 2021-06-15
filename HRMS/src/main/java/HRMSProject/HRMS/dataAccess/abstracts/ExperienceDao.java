package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMSProject.HRMS.entities.concrete.Experience;

public interface ExperienceDao  extends JpaRepository<Experience,Integer>{

}
