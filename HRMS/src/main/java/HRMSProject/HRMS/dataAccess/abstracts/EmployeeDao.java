package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
