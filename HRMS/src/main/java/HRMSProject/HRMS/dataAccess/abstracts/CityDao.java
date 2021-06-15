package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.City;


public interface CityDao  extends JpaRepository<City,Integer>{

}
