package trace.Lab12PartC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class Lab12PartCApplication implements CommandLineRunner {

	@Autowired
	UserService service;
	public static void main(String[] args) {
		SpringApplication.run(Lab12PartCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.print();
	}
}
