package HRMSProject.HRMS.business.abstracts;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;

import java.util.List;
import HRMSProject.HRMS.entities.concrete.Employee;
public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
}
