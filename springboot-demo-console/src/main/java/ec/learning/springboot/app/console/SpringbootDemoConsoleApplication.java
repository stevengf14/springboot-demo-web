package ec.learning.springboot.app.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoConsoleApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(SpringbootDemoConsoleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// System.out.println("Hi coders from Spring Boot console");
		log.info("Hi coders from SpringBoot console");
		log.warn("Warn Log coders");
	}

}
