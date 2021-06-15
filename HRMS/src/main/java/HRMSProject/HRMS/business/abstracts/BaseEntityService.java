package HRMSProject.HRMS.business.abstracts;

import HRMSProject.HRMS.core.utilities.results.Result;

import java.util.List;

import HRMSProject.HRMS.core.utilities.results.DataResult;
public interface BaseEntityService <T>{
Result add(T entity);
	
	Result update(T entity);
	
	Result delete(T entity);

	DataResult<List<T>> getAll();
	
	DataResult<T> getById(int id);
}
