package playwithjava.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootUrekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUrekaServerApplication.class, args);
	}

}
