package HRMSProject.HRMS.business.concretes;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import HRMSProject.HRMS.business.abstracts.EmployeeService;
import HRMSProject.HRMS.business.abstracts.ImageService;
import HRMSProject.HRMS.business.adapters.CloudStorageService;
import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.Result;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessResult;
import HRMSProject.HRMS.dataAccess.abstracts.ImageDao;
import HRMSProject.HRMS.entities.concrete.Image;
@Service
public class ImageManager implements ImageService
{
	private ImageDao imageDao;
	private CloudStorageService cloudStorageService;
	private EmployeeService employeeService;

	@Autowired
	public ImageManager(ImageDao imageDao, CloudStorageService cloudStorageService, EmployeeService employeeService) {
		this.imageDao = imageDao;
		this.cloudStorageService = cloudStorageService;
		this.employeeService = employeeService;
	}

	@Override
	public Result add(Image entity) {

		imageDao.save(entity);
		return new SuccessResult("İmaj eklendi.");
	}

	@Override
	public Result update(Image entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Image entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Image> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result upload(int userId, MultipartFile file) {

		Map<?, ?> uploadImage = (Map<?, ?>) cloudStorageService.upload(file).getData();

		Image image = new Image();
		image.setEmployee(employeeService.getById(userId).getData());
		image.setUrl(uploadImage.get("url").toString());

		this.imageDao.save(image);
		return new SuccessResult();
	}


	@Override
	public DataResult<Image> getByUserId(int userId) {
		return new SuccessDataResult<Image>(this.imageDao.getByEmployee_Id(userId));
	}

}
