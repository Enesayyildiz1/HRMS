package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.PositionService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.dataAccess.abstracts.PositionDao;
import HRMSProject.HRMS.entities.concrete.Position;

@Service
public class PositionManager implements PositionService {
	private PositionDao _positionDao;
	@Autowired
	public PositionManager(PositionDao _positionDao) {
		super();
		this._positionDao = _positionDao;
	}
	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>(this._positionDao.findAll());
	}
	@Override
	public Result add(Position entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result update(Position entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result delete(Position entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Position> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
