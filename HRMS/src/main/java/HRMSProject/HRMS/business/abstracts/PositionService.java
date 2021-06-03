package HRMSProject.HRMS.business.abstracts;

import java.util.List;

import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.entities.concrete.Position;

public interface PositionService {
	DataResult<List<Position>> getAll();
}
