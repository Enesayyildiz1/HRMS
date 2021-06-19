package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.CandidateService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.CandidateDao;
import HRMSProject.HRMS.entities.concrete.Candidate;
import HRMSProject.HRMS.entities.concrete.Employee;

@Service
public class CandidateManager implements CandidateService{
	private CandidateDao candidateDao;
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate entity) {
		this.candidateDao.save(entity);
		return new SuccessResult();
	}

	@Override
	public Result update(Candidate entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Candidate entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Candidate> getById(int id) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));
		
	}

}
