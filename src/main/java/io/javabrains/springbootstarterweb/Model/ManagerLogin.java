package io.javabrains.springbootstarterweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager_login")
public class ManagerLogin {
	
   @Id	
   private int man_id;
   private String email;
   private String password;
   
   
   
@Override
public String toString() {
	return "ManagerLogin [man_id=" + man_id + ", email=" + email + ", password=" + password + "]";
}
public ManagerLogin(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public int getMan_id() {
	return man_id;
}
public void setMan_id(int man_id) {
	this.man_id = man_id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
