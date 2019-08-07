package net.logcd.ws.svc.conf;
import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.context.support.ServletConfigPropertySource;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;

@Configuration
public class WSAxisConfig {

	/**
	 * servlet过滤规则
	 * @return
	 */
	@Bean
	public ServletRegistrationBean dispatcherRegistration() {
		ServletRegistrationBean axisServlet = new ServletRegistrationBean(new AxisServlet(), "/axis/services/*");
		axisServlet.setName("axisServlet");
		axisServlet.setLoadOnStartup(1);
		return axisServlet;
	}
	
}
