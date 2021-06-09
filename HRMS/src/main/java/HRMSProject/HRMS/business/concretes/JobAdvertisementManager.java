package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.JobAdvertisementService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
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
}
