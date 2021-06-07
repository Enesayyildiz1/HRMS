package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Objects;

import HRMSProject.HRMS.business.abstracts.EmployerService;
import HRMSProject.HRMS.business.abstracts.EmployerValidateService;
import HRMSProject.HRMS.core.abstracts.EmailCheckService;
import HRMSProject.HRMS.core.abstracts.EmailDomainCheckService;
import HRMSProject.HRMS.core.abstracts.EmailVerificationService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.ErrorResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.EmployerDao;
import HRMSProject.HRMS.entities.concrete.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	private EmployerValidateService employerValidityService;
	private EmailCheckService emailCheckService;	
	private EmailVerificationService emailVerificationService;
	private EmailDomainCheckService emailDomainCheckService;
		
	    @Autowired
		public EmployerManager(EmployerDao employerDao, EmployerValidateService employerValidityService,
			EmailCheckService emailCheckService, EmailVerificationService emailVerificationService,
			EmailDomainCheckService emailDomainCheckService) {
		super();
		this.employerDao = employerDao;
		this.employerValidityService = employerValidityService;
		this.emailCheckService = emailCheckService;
		this.emailVerificationService = emailVerificationService;
		this.emailDomainCheckService = emailDomainCheckService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public Result add(Employer employer) {
		
		if (
			(!employerValidityService.isCompanyNameEmpty(employer.getCompanyName()))&&
			(!employerValidityService.isPhoneNumberEmpty(employer.getPassword()))&&
			(!employerValidityService.isWebAddressEmpty(employer.getWebAddress()))&&
			(!employerValidityService.isPasswordEmpty(employer.getPassword()))&&
			(!employerValidityService.isPasswordAgainEmpty(employer.getPasswordAgain()))&&
			
			employerValidityService.emailIsItUsed(employer.getEmail())&&
			emailCheckService.isEmailValid(employer.getEmail())&&
			emailDomainCheckService.isEmailAndDomainNameSame(employer.getWebAddress(), employer.getEmail())&&
			
			Objects.equal(employer.getPassword(), employer.getPasswordAgain())){
			
			emailVerificationService.sendVerificationEmail(employer.getEmail());
			employer.setVerificationStatus(false);
			
			this.employerDao.save(employer);
			
			return new SuccessResult("Kayıt Başarılı! Lütfen e-mail adresinize gönderilen kodu onaylayınız");
			
		}else {
			return new ErrorResult("Kayıt Başarısız");
		}
	}

}
