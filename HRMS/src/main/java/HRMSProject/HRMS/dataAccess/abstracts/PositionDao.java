package HRMSProject.HRMS.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.Position;
public interface PositionDao extends JpaRepository<Position,Integer>{

}
