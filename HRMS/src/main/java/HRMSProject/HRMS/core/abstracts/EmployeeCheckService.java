package HRMSProject.HRMS.core.abstracts;

import HRMSProject.HRMS.entities.concrete.Employee;

public interface EmployeeCheckService {
	public boolean checkIfRealPerson(Employee employee);
}
