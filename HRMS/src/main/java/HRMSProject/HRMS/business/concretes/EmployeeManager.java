package HRMSProject.HRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.EmployeeService;
import HRMSProject.HRMS.business.abstracts.EmployeeValidateService;
import HRMSProject.HRMS.core.abstracts.EmailCheckService;
import HRMSProject.HRMS.core.abstracts.EmailVerificationService;
import HRMSProject.HRMS.core.abstracts.EmployeeCheckService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.ErrorResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.EmployeeDao;
import HRMSProject.HRMS.entities.concrete.Employee;


@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao _employeeDao;
	private EmployeeValidateService _employeeValidateService;
	private EmailVerificationService _emailVerificationService;
	private EmployeeCheckService _employeeCheckService;
	private EmailCheckService _emailCheckService;
	@Autowired
	public EmployeeManager(EmployeeDao _employeeDao,EmployeeValidateService _employeeValidateService,EmailVerificationService _emailVerificationService,EmployeeCheckService _employeeCheckService, EmailCheckService _emailCheckService) {
		super();
		this._employeeDao = _employeeDao;
		this._employeeValidateService=_employeeValidateService;
		this._emailVerificationService=_emailVerificationService;
		this._employeeCheckService=_employeeCheckService;
		this._emailCheckService=_emailCheckService;
	}
	@Override
	public DataResult<List<Employee>> getAll() {
	
		return new SuccessDataResult<List<Employee>>(this._employeeDao.findAll());
	}
	@Override
	public Result add(Employee employee) {
				
		
		if(_employeeValidateService.isNameEmpty(employee.getEmployeeName())&&
				_employeeValidateService.isSurnameEmpty(employee.getEmployeeSurname())&&	
				_employeeValidateService.isNationalityIdEmpty(employee.getNationalIdentity())&&
				_employeeValidateService.isBirthYearEmpty(employee.getYearOfBirth())&&
				_employeeValidateService.isSurnameEmpty(employee.getEmployeeSurname())&&	
				_employeeValidateService.isPasswordEmpty(employee.getPassword())&&
				_employeeValidateService.isPasswordAgainEmpty(employee.getPasswordAgain())&&
				_employeeValidateService.isEqualPasswords(employee.getPassword(),employee.getPasswordAgain())&&
				_employeeCheckService.checkIfRealPerson(employee)&&
				_emailCheckService.isEmailValid(employee.getEmail()))
			
		       
				
				
				
			
		{
			_emailVerificationService.sendVerificationEmail(employee.getEmail());
			  this._employeeDao.save(employee);
			  return new SuccessResult("Kayıt Başarılı");
		}
		else {
			return new ErrorResult();
		}
        
		 
	
	
	}
	@Override
	public Result update(Employee entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result delete(Employee entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Employee> getById(int id) {
		return new SuccessDataResult<Employee>(this._employeeDao.getById(id));
	}

}
