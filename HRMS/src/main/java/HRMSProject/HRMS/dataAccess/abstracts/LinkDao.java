package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.Link;



public interface LinkDao  extends JpaRepository<Link,Integer>{

}
