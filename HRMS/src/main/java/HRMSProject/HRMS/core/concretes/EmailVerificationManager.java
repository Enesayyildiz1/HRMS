package HRMSProject.HRMS.core.concretes;



import org.springframework.stereotype.Service;

import HRMSProject.HRMS.core.abstracts.EmailVerificationService;


@Service
public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public void sendVerificationEmail(String email) {
		
		System.out.println("'"+email+"' adresine doğrulama e-postası gönderildi.");
	}

	

}
