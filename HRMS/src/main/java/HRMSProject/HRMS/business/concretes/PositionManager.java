package HRMSProject.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSProject.HRMS.business.abstracts.PositionService;
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
	public List<Position> getAll() {
		return this._positionDao.findAll();
	}

}
