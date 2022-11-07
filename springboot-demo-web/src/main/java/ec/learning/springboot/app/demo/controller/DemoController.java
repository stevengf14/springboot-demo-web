package ec.learning.springboot.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.learning.springboot.app.demo.model.Person;
import ec.learning.springboot.app.demo.repo.IPerson;

/**
 *
 * @author Steven Guamán - November 2022
 */
@Controller
public class DemoController {

	@Autowired
	private IPerson repo;

	// test -> http://localhost:9898/greeting?name=andres
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {

		Person person = new Person();
		person.setId(1);
		person.setName("Steven");
		repo.save(person);

		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/list")
	public String greeting(Model model) {
		model.addAttribute("people", repo.findAll());
		return "greeting";
	}
}
