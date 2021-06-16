package HRMSProject.HRMS.api;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import HRMSProject.HRMS.business.abstracts.ImageService;
import HRMSProject.HRMS.core.utilities.results.Result;


@RestController
@RequestMapping("/api/images")
public class ImagesController {
		private ImageService imageService;

		public ImagesController(ImageService imageService) {
			super();
			this.imageService = imageService;
		}

		@PostMapping("/upload")
		public Result upload(@RequestParam int userId, @RequestParam MultipartFile file) {
			return imageService.upload(userId, file);
		}

}
