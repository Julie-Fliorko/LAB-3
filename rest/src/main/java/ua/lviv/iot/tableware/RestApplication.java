package ua.lviv.iot.tableware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"ua.lviv.iot.tableware.dataaccess"})
@ComponentScan({"ua.lviv.iot.tableware.controller", "ua.lviv.iot.tableware.business", "ua.lviv.iot.tableware.dataaccess"})
//@EntityScan({"tableware.spring.first.rest.my.controller"})

public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
