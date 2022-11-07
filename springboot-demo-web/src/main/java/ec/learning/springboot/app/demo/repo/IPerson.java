package ec.learning.springboot.app.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.learning.springboot.app.demo.model.Person;

/**
 *
 * @author Steven Guamán - November 2022
 */
public interface IPerson extends JpaRepository<Person, Integer> {
	
}
