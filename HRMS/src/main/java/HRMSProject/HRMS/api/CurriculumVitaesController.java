package HRMSProject.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMSProject.HRMS.business.abstracts.CurriculumVitaeService;
import HRMSProject.HRMS.core.utilities.results.DataResult;

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
@GetMapping("/getcvdetails")
public DataResult<CvDtoForAllEntities> getCvDetailsEmployerId(@RequestParam int id)
{
	return this._cvService.getCvDetailsByEmployeeId(id);
	
}
}
