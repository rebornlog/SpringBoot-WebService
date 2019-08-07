package net.logcd.ws.svc.conf;

import org.codehaus.xfire.spring.XFireSpringServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lenovo on 2019/8/5.
 */
@Configuration
public class XfireConfig {
    @Bean
    public ServletRegistrationBean xfireServlet() {
        return new ServletRegistrationBean(new XFireSpringServlet(), "/xfire/services/*");
    }
}
