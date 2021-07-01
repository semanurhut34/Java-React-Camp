package kodlamaio.dayNineLectureTwo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Configuration
public class MernisConfig {

	
	@Bean
	public KPSPublicSoapProxy kpsPublicSoapProxy() {
		
		return new KPSPublicSoapProxy();
	}
}
