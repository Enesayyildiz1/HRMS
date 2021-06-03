package HRMSProject.HRMS.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class Position {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int positionId;
	@Column(name="job_name")
	private String jobName;
	public Position()
	{
	}
	public Position(int positionId, String jobName) {
		super();
		this.positionId = positionId;
		this.jobName = jobName;
	}
	
	public int getId() {
		return positionId;
	}
	public void setId(int id) {
		this.positionId = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
