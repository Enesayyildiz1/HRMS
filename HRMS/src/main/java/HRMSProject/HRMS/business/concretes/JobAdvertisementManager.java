package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.JobAdvertisementService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.JobAdvertisementDao;
import HRMSProject.HRMS.entities.concrete.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	private JobAdvertisementDao _jobAdvertisementDao;
	
@Autowired
	public JobAdvertisementManager(JobAdvertisementDao _jobAdvertisementDao) {
		super();
		this._jobAdvertisementDao = _jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this._jobAdvertisementDao.findAll());
		
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		  this._jobAdvertisementDao.save(jobAdvertisement);
		  return new SuccessResult("İş ilanı başarıyla oluşturuldu");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive() {
		return new SuccessDataResult<List<JobAdvertisement>>(this._jobAdvertisementDao.findByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByApplicationDeadlineDesc() {
   Sort sort=Sort.by(Sort.Direction.ASC,"applicationDeadline");
		
		return new SuccessDataResult<List<JobAdvertisement>>(this._jobAdvertisementDao.findAll(sort),"Başarılı");
	}
	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_EmployerId(int id) {
		
		 
			
			return new SuccessDataResult<List<JobAdvertisement>>(this._jobAdvertisementDao.findByIsActiveTrueAndEmployerId(id),"Başarılı");
	}
}
