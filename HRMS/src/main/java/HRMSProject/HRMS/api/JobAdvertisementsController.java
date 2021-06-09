package HRMSProject.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSProject.HRMS.business.abstracts.JobAdvertisementService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
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
}
