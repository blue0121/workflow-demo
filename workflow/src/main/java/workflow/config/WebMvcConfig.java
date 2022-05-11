package workflow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import workflow.interceptor.LoginInterceptor;

/**
 * @author Jin Zheng
 * @since 2022-05-09
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	public WebMvcConfig() {
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		var login = new LoginInterceptor();
		registry.addInterceptor(login).addPathPatterns("/**").excludePathPatterns("/login","/css/**","/js/**","/fonts/**");
	}
}
