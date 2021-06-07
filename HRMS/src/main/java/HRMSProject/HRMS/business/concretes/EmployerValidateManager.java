package HRMSProject.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.EmployerValidateService;
import HRMSProject.HRMS.dataAccess.abstracts.EmployerDao;
import HRMSProject.HRMS.entities.concrete.Employer;

@Service
public class EmployerValidateManager implements EmployerValidateService {

	private EmployerDao _employerDao;
	
	
	@Autowired
	public EmployerValidateManager(EmployerDao _employerDao) {
		super();
		this._employerDao = _employerDao;
	}

	@Override
	public boolean isCompanyNameEmpty(String companyName) {
         if(companyName.isEmpty()){
			
			System.out.println("WARNING: you must enter your company name");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isWebAddressEmpty(String webAddress) {
if(webAddress.isEmpty()){
			
			System.out.println("WARNING: you must enter your web address");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isPhoneNumberEmpty(String phoneNumber) {
if(phoneNumber.isEmpty()){
			
			System.out.println("WARNING: you must enter your phone number");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isPasswordEmpty(String password) {
if(password.isEmpty()){
			
			System.out.println("WARNING: you must enter your password");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean isPasswordAgainEmpty(String passwordAgain) {
if(passwordAgain.isEmpty()){
			
			System.out.println("WARNING: you must enter again your company password");
			
		return true;
		
	    }else {
	    	
		return false;
		
	          }
	}

	@Override
	public boolean emailIsItUsed(String email) {
		
		for(Employer employer : _employerDao.findAll()) {
			if(email.equals(employer.getEmail())) {
				System.out.println("WARNING: bu e-mail'e kayıtlı bir hesap vardır");
				return false;
			}
		}
		return true;
	}

}
