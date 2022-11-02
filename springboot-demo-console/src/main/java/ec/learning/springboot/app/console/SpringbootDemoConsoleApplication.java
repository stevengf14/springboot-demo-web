package ec.learning.springboot.app.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.learning.springboot.app.console.service.IPersonService;

@SpringBootApplication
public class SpringbootDemoConsoleApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringbootDemoConsoleApplication.class);
	
	@Autowired
	private IPersonService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// System.out.println("Hi coders from Spring Boot console");
		LOG.info("Hi coders from SpringBoot console");
		LOG.warn("Warn Log coders");
		service.register("Steven");
	}

}
