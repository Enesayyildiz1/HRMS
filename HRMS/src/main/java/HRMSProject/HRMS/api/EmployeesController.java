package HRMSProject.HRMS.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;

import java.util.List;
import HRMSProject.HRMS.entities.concrete.Employee;
import HRMSProject.HRMS.business.abstracts.EmployeeService;


@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	private EmployeeService _employeeService;
	@Autowired
	public EmployeesController(EmployeeService _employeeService) {
		super();
		this._employeeService = _employeeService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll()
	{
		return this._employeeService.getAll();
     }
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee)
	{
		return this._employeeService.add(employee);
     }
}
