package HRMSProject.HRMS.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import HRMSProject.HRMS.core.abstracts.EmployeeCheckService;
import HRMSProject.HRMS.entities.concrete.Employee;

@Component
@Primary
public class FakeMernisServiceAdapter implements EmployeeCheckService {

	@Override
	public boolean checkIfRealPerson(Employee employee) {
		// TODO Auto-generated method stub
		return true;
	}

}
