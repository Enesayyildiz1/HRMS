package HRMSProject.HRMS.business.adapters;

import org.springframework.web.multipart.MultipartFile;

import HRMSProject.HRMS.core.utilities.results.DataResult;

public interface CloudStorageService {
	DataResult<?> upload(MultipartFile multipartFile);
}
