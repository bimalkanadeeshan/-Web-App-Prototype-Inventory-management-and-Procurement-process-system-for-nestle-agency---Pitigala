package io.javabrains.springbootstarterweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operator_login")
public class OperatorLogin {
	
	@Id
	private int ope_id;
	private String email;
	private String password;
	
	
	
	@Override
	public String toString() {
		return "OperatorLogin [ope_id=" + ope_id + ", email=" + email + ", password=" + password + "]";
	}

	public OperatorLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public int getOpe_id() {
		return ope_id;
	}
	public void setOpe_id(int ope_id) {
		this.ope_id = ope_id;
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
