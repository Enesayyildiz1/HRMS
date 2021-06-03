package HRMSProject.HRMS.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.EmployeeService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.ErrorResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.EmployeeDao;
import HRMSProject.HRMS.entities.concrete.Employee;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao _employeeDao;
	@Autowired
	public EmployeeManager(EmployeeDao _employeeDao) {
		super();
		this._employeeDao = _employeeDao;
	}
	@Override
	public DataResult<List<Employee>> getAll() {
	
		return new SuccessDataResult<List<Employee>>(this._employeeDao.findAll());
	}
	@Override
	public Result add(Employee employee) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		try {
			if	(kpsPublic.TCKimlikNoDogrula( 
					Long.parseLong(employee.getNationalIdentity()),
					employee.getEmployeeName(), 
					employee.getEmployeeSurname(),
					Integer.parseInt(employee.getYearOfBirth()))==true)
				{
					this._employeeDao.save(employee);
		            return new SuccessResult();
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ErrorResult(e.getMessage());
		};
		return null;
	
	}

}
