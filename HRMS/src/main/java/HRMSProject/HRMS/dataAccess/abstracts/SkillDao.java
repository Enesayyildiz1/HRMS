package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMSProject.HRMS.entities.concrete.Skill;

public interface SkillDao  extends JpaRepository<Skill,Integer>{

}
