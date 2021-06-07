package HRMSProject.HRMS.core.concretes;

import org.springframework.stereotype.Service;

import com.google.common.base.Objects;

import HRMSProject.HRMS.core.abstracts.EmailDomainCheckService;
@Service
public class EmailDomainCheckManager implements EmailDomainCheckService {

	@Override
	public boolean isEmailAndDomainNameSame(String website, String email) {
boolean result = false;
		
		
		String[] e_mail = email.split("@");
		
		if (Objects.equal(e_mail[1], website)) {
			result = true;
		}
		System.out.println("WARNING: Domain adınız ve mail adresiniz aynı olmalı! ");
		return result;
	}

}
