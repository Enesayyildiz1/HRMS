package HRMSProject.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import HRMSProject.HRMS.entities.concrete.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{
	@Query("From JobAdvertisement where activationStatus=true")
	List<JobAdvertisement> findByIsActiveTrue();

	@Query("From JobAdvertisement where activationStatus = true and employer.id =:id")
	List<JobAdvertisement> findByIsActiveTrueAndEmployerId(int id);
	
}
