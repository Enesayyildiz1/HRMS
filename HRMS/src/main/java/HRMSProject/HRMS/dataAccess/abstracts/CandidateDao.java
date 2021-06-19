package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSProject.HRMS.entities.concrete.Candidate;


public interface CandidateDao extends JpaRepository<Candidate,Integer>{

}
