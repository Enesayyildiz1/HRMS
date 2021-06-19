package HRMSProject.HRMS.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSProject.HRMS.business.abstracts.CandidateService;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.entities.concrete.Candidate;



@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	private CandidateService candidateService;
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate)
	{
		return this.candidateService.add(candidate);
	}
}
