package HRMSProject.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMSProject.HRMS.entities.concrete.User;

public interface UserDao  extends JpaRepository<User,Integer>{

}
