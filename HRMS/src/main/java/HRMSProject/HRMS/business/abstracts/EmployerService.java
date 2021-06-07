package HRMSProject.HRMS.business.abstracts;

import java.util.List;

import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;

import HRMSProject.HRMS.entities.concrete.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
}
