package HRMSProject.HRMS.business.adapters;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import HRMSProject.HRMS.core.utilities.results.DataResult;
import HRMSProject.HRMS.core.utilities.results.ErrorDataResult;
import HRMSProject.HRMS.core.utilities.results.SuccessDataResult;
@Service
public class CloudinaryServiceAdapter implements CloudStorageService{

private Cloudinary cloudinary;
	
	@Autowired
	public CloudinaryServiceAdapter() {
		cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "enesayyildiz",
				"api_key", "362121212181236",
				"api_secret", "3oZk97js7JSjeZWy_vM1pAq3OrQ"));
	}
	@Override
	public DataResult<?> upload(MultipartFile multipartFile) {

		try {
			Map<?, ?> uploadResult = cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<>(uploadResult);
		} catch (IOException e) {
			e.printStackTrace();
			return new ErrorDataResult<>(false);
		}
	}
	}

