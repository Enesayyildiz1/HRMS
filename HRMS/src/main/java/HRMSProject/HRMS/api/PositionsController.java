package HRMSProject.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSProject.HRMS.business.abstracts.PositionService;

import HRMSProject.HRMS.entities.concrete.Position;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
PositionService _positionService;

@Autowired
public PositionsController(PositionService _positionService) {
	super();
	this._positionService = _positionService;
}


@GetMapping("/getall")
public List<Position> getAll()
{
	return this._positionService.getAll();
}
}
