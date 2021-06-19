package HRMSProject.HRMS.business.abstracts;

import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.entities.concrete.CurriculumVitae;
import HRMSProject.HRMS.entities.dtos.CvDtoForAllEntities;

public interface CurriculumVitaeService extends BaseEntityService <CurriculumVitae>{
	DataResult<CurriculumVitae> getByCandidateId(int candidateId);
	DataResult<CvDtoForAllEntities> getCvDetailByCandidateId(int id);
}
