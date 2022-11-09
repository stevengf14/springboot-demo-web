package ec.learning.springboot.app.demo;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ec.learning.springboot.app.demo.model.Users;
import ec.learning.springboot.app.demo.repo.IUsers;

/**
 *
 * @author Steven Guamán - November 2022
 */
@SpringBootTest
class SpringbootDemoWebApplicationTests {

	@Autowired
	private IUsers repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void createUserTest() {
		Users user = new Users();
		user.setId(3);
		user.setUsername("german");
		user.setPassword(encoder.encode("1234"));
		Users userReturn = repo.save(user);

		assertTrue(userReturn.getPassword().equalsIgnoreCase(user.getPassword()));
	}

}
