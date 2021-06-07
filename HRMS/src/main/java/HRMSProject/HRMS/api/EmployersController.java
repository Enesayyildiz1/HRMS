package HRMSProject.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.entities.concrete.Employer;
import HRMSProject.HRMS.business.abstracts.EmployerService;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
		private EmployerService _employerService;
@Autowired
		public EmployersController(EmployerService _employerService) {
			super();
			this._employerService = _employerService;
		}
		
@GetMapping("/getall")
		public DataResult<List<Employer>> getAll()
		{
			return this._employerService.getAll();
		}
@PostMapping("/add")
public Result add(@RequestBody Employer employer)
{
	return this._employerService.add(employer);
}
}
