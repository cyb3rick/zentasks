package models;

import javax.persistence.*;

import play.db.ebean.Model;

@Entity
public class User extends Model {
	
	@Id
	public String email; // notice it's public! this will be our id
	public String name;
	public String password;
	
	public User(String email, String name, String password) {
		this.email = email;
		this.name = name;
		this.password = password;
	}
	
	// Find will be used to programatically make querie
	public static Finder<String, User> find = new Finder<String, User>(
			String.class, User.class
			);
			
	
}
