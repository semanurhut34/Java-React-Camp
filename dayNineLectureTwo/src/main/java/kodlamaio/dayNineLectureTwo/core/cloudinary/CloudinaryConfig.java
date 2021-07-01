package kodlamaio.dayNineLectureTwo.core.cloudinary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudinaryConfig {
	
	private Environment environment;
	@Autowired
	  public CloudinaryConfig(Environment environment) {
		super();
		this.environment = environment;
	}

	@Bean
      public CloudinaryService cloudinaryService() {
		  return new CloudinaryManager(cloudinary());
		
	  }
	  
	  @Bean
	  
		public Cloudinary cloudinary() {
			return new Cloudinary(ObjectUtils.asMap("cloud_name",environment.getProperty("cloud_name"), 
					"api_key",environment.getProperty("api_key"), 
					"api_secret",environment.getProperty("api_secret")));
		}
	  
	  
	  
	
	

}
