package ec.learning.springboot.app.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.learning.springboot.app.demo.model.Users;

/**
 *
 * @author Steven Guamán - November 2022
 */
public interface IUsers extends JpaRepository<Users, Integer> {

	Users findByUsername(String username);

}
