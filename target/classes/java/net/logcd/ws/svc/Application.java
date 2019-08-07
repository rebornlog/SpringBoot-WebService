package net.logcd.ws.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.OAuth2AutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={DataSourceTransactionManagerAutoConfiguration.class,XADataSourceAutoConfiguration.class,JndiDataSourceAutoConfiguration.class,SecurityAutoConfiguration.class, OAuth2AutoConfiguration.class,SecurityFilterAutoConfiguration.class,DataSourceAutoConfiguration.class})
@ServletComponentScan
@ComponentScan("net.logcd.ws.svc")
@ImportResource("classpath:xfire-servlet.xml")
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
}
