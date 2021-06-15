package HRMSProject.HRMS.business.abstracts;

import java.util.List;

import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.entities.concrete.Employee;
import HRMSProject.HRMS.entities.concrete.JobAdvertisement;


public interface JobAdvertisementService extends BaseEntityService<JobAdvertisement>{
	
	DataResult<List<JobAdvertisement>> getByIsActive();

	DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByApplicationDeadlineDesc();

	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_EmployerId(int id);
}
