package HRMSProject.HRMS.business.abstracts;

import java.util.List;

import HRMSProject.HRMS.entities.concrete.Position;

public interface PositionService {
	List<Position> getAll();
}
