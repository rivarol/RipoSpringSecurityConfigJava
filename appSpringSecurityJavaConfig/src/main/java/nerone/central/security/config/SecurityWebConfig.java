package nerone.central.security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SecurityWebConfig extends AbstractSecurityWebApplicationInitializer{

	public SecurityWebConfig() {
		super(MySecurityConfig.class);
	}	
	

}
