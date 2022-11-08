package ec.learning.springboot.app.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.learning.springboot.app.demo.model.Person;
import ec.learning.springboot.app.demo.repo.IPerson;

/**
 *
 * @author Steven Guamán - October 2022
 */
@RestController
@RequestMapping("/people")
public class RestDemoController {

	@Autowired
	private IPerson repo;

	@GetMapping
	public List<Person> getAll() {
		return repo.findAll();
	}

	@PostMapping
	public void insert(@RequestBody Person person) {
		repo.save(person);
	}

	@PutMapping
	public void update(@RequestBody Person person) {
		repo.save(person);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
