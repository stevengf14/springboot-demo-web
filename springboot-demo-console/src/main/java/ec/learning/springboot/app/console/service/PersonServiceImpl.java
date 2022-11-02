package ec.learning.springboot.app.console.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.learning.springboot.app.console.repository.IPersonRepo;

/**
 *
 * @author Steven Guamán - November 2022
 */
@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonRepo repo;

	@Override
	public void register(String name) {
		repo.register(name);
	}

}
