package HRMSProject.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMSProject.HRMS.business.abstracts.JobAdvertisementService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.entities.concrete.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
private JobAdvertisementService _jobAdvertisementService;
@Autowired
public JobAdvertisementsController(JobAdvertisementService _jobAdvertisementService) {
	super();
	this._jobAdvertisementService = _jobAdvertisementService;
}
@GetMapping("/getall")
public DataResult<List<JobAdvertisement>> getAll()
{
	return this._jobAdvertisementService.getAll();
}
@PostMapping("/add")
public Result add(@RequestBody JobAdvertisement jobAdvertisement)
{
	return this._jobAdvertisementService.add(jobAdvertisement);
	
}
@GetMapping("/getbyisactive")
public DataResult<List<JobAdvertisement>> getByIsActive()
{
	return this._jobAdvertisementService.getByIsActive();
	
}
@GetMapping("/getbyapplicationdeadlineDesc")
public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByApplicationDeadlineDesc()
{
	return this._jobAdvertisementService.getByIsActiveTrueOrderByApplicationDeadlineDesc();
	
}
@GetMapping("/getbyemployerid")
public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployerId(@RequestParam int id)
{
	return this._jobAdvertisementService.getByIsActiveTrueAndEmployer_EmployerId(id);
	
}
}
