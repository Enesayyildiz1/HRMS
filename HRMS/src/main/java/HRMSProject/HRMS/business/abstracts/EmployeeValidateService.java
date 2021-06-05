package HRMSProject.HRMS.business.abstracts;




public interface EmployeeValidateService {
	boolean isNameEmpty(String name);
	boolean isSurnameEmpty(String surname);
	boolean isBirthYearEmpty(String birthYear);
	boolean isNationalityIdEmpty(String nationalityId);
	boolean isPasswordEmpty(String password);
	boolean isPasswordAgainEmpty(String passwordAgain);
	boolean isEqualPasswords(String password,String re_Password);
	boolean emailIsItUsed(String email);
	boolean nationalityIdIsItUsed(String nationalityId);
}
