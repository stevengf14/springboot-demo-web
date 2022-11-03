package ec.learning.springboot.app.console.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven Guamán - November 2022
 */
@Repository
@Qualifier("person2")
public class PersonRepoImpl2 implements IPersonRepo {

	private static Logger LOG = LoggerFactory.getLogger(PersonRepoImpl2.class);

	@Override
	public void register(String name) {
		LOG.info(name + " registered 2");
	}

}
