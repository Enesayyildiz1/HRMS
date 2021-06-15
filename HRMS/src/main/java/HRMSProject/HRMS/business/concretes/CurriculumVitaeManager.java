package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import HRMSProject.HRMS.business.abstracts.CurriculumVitaeService;

import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.dataAccess.abstracts.CurriculumVitaeDao;
import HRMSProject.HRMS.entities.concrete.CurriculumVitae;
import HRMSProject.HRMS.entities.dtos.CvDtoForAllEntities;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService{

	private CurriculumVitaeDao cvDao;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao cvDao) {
		super();
		this.cvDao = cvDao;
	
	}

	
	@Override
	public Result add(CurriculumVitae entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CurriculumVitae entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(CurriculumVitae entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CurriculumVitae> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CvDtoForAllEntities> getCvDetailsByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return new  SuccessDataResult<CvDtoForAllEntities>(cvDao.getDtosByEmployee_Id(employeeId));
	}


	@Override
	public DataResult<CurriculumVitae> getByCandidateId(int candidateId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<CurriculumVitae>(cvDao.getByEmployee_Id(candidateId));
	}

}
