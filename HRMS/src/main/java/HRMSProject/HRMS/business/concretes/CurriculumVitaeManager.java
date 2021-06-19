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
	public DataResult<CurriculumVitae> getByCandidateId(int candidateId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<CurriculumVitae>(cvDao.getByCandidate_Id(candidateId));
	}


	@Override
	public DataResult<CvDtoForAllEntities> getCvDetailByCandidateId(int id) {
		CurriculumVitae cv=getByCandidateId(id).getData();
		CvDtoForAllEntities cvDetail=new CvDtoForAllEntities();
		cvDetail.setId(cv.getId());
		cvDetail.setCreationDate(cv.getCreationDate());
		cvDetail.setCandidate(cv.getCandidate());
		cvDetail.setCoverLetter(cv.getCoverLetter());
		cvDetail.setEducations(cv.getEducations());
		cvDetail.setLanguages(cv.getLanguageLevels());
		cvDetail.setExperiences(cv.getExperiences());
		cvDetail.setSkills(cv.getSkills());
		cvDetail.setLinks(cv.getLinks());
		return new SuccessDataResult<CvDtoForAllEntities>(cvDetail);
	}

}
