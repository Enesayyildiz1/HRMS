package HRMSProject.HRMS.business.abstracts;

import org.springframework.web.multipart.MultipartFile;



import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.entities.concrete.Image;

public interface ImageService extends BaseEntityService<Image>{
	Result upload(int userId, MultipartFile file);
	DataResult<Image> getByUserId(int userId);
}
