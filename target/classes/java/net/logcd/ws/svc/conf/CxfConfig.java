package net.logcd.ws.svc.conf;

import net.logcd.ws.svc.service.CxfWebService;
import net.logcd.ws.svc.service.CxfWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author 水木年华
 * @title: CxfConfig
 * @projectName springboot-svc
 * @description: TODO
 * @date 2019/8/316:37
 */
@Configuration
public class CxfConfig {

    @Bean
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public CxfWebService cxfWebService() {
        return new CxfWebServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), cxfWebService());
        endpoint.publish("/services");
        return  endpoint;
    }
}
