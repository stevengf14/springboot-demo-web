package ec.learning.springboot.app.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Steven Guamán - November 2022
 */
@Entity
public class Users {

	@Id
	private int id;
	private String username;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
