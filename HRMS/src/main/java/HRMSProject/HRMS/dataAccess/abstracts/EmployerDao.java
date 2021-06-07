package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{
			
}
