package HRMSProject.HRMS.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMSProject.HRMS.business.abstracts.CurriculumVitaeService;
import HRMSProject.HRMS.core.utilities.results.DataResult;

import HRMSProject.HRMS.entities.concrete.CurriculumVitae;
import HRMSProject.HRMS.entities.dtos.CvDtoForAllEntities;


@RestController
@RequestMapping("/api/curriculumvitaes")
public class CurriculumVitaesController {
	private CurriculumVitaeService _cvService;
@Autowired
	public CurriculumVitaesController(CurriculumVitaeService _cvService) {
		super();
		this._cvService = _cvService;
	}
@GetMapping("/getcvbyemployeeid")
public DataResult<CurriculumVitae> getCvByEmployerId(@RequestParam int id)
{
  return _cvService.getByCandidateId(id);
}
@GetMapping("/getcvdetailbyemployeeid")
public DataResult<CvDtoForAllEntities> getCvDetailByEmployerId(@RequestParam int id)
{
  return _cvService.getCvDetailByEmployeeId(id);
}
}
