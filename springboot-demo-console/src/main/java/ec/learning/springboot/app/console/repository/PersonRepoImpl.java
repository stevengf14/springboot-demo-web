package ec.learning.springboot.app.console.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven Guamán - November 2022
 */
@Repository
public class PersonRepoImpl implements IPersonRepo {

	private static Logger LOG = LoggerFactory.getLogger(PersonRepoImpl.class);

	@Override
	public void register(String name) {
		LOG.info(name + " registered");
	}

}
