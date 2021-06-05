package HRMSProject.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.EmployeeValidateService;
import HRMSProject.HRMS.core.utilities.results.ErrorResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.EmployeeDao;
import HRMSProject.HRMS.entities.concrete.Employee;
@Service
public class EmployeeValidateManager implements EmployeeValidateService{
	private EmployeeDao _employeeDao;
	@Autowired
	public EmployeeValidateManager(EmployeeDao _employeeDao) {
		super();
		this._employeeDao = _employeeDao;
	}
	@Override
	public boolean isNameEmpty(String name) {
		if(name.isEmpty())
		{
			System.out.println("İsim alanı boş olamaz");
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public boolean isSurnameEmpty(String surname) {
		if(surname.isEmpty())
		{
			System.out.println("Soyisim alanı boş olamaz");
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public boolean isBirthYearEmpty(String birthYear) {
		if(birthYear.isEmpty())
		{
			System.out.println("Doğum günü alanı boş olamaz");
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public boolean isNationalityIdEmpty(String nationalityId) {
		if(nationalityId.isEmpty())
		{
			System.out.println("Soyisim alanı boş olamaz");
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public boolean isPasswordEmpty(String password) {
		if(password.isEmpty())
		{
			System.out.println("Soyisim alanı boş olamaz");
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public boolean isPasswordAgainEmpty(String passwordAgain) {
		if(passwordAgain.isEmpty())
		{
			System.out.println("Soyisim alanı boş olamaz");
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public boolean isEqualPasswords(String password,String re_Password) {
		if(password.equals(re_Password))
		{
			return true;
		}
		else {
			System.out.println("Şifreler Eşleşmiyor");
			return false;
		}
	}
	@Override
	public boolean emailIsItUsed(String email) {
		for(Employee employee : _employeeDao.findAll()) {
			if(email.equals(employee.getEmail())) {
				System.out.println("WARNING: bu e-mail'e kayıtlı bir hesap vardır");
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean nationalityIdIsItUsed(String nationalityId) {
		for(Employee employee : _employeeDao.findAll()) {
			if(nationalityId.equals(employee.getNationalIdentity())) {
				System.out.println("WARNING: bu Tc No'ya kayıtlı bir hesap vardır");

				return false;
			}
		}
		return true;
	}
	
}
