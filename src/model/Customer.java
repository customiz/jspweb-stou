package model;

import java.time.LocalDate;

public class Customer {
	private String firstname, lastname, loginname, password;
	private LocalDate registerdate;
	private static int nextId = 1;
	private int id;

	public Customer(String firstname, String lastname, String loginname, String password, LocalDate registerdate) {
		this.id = nextId++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.loginname = loginname;
		this.password = password;
		this.registerdate = registerdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(LocalDate registerdate) {
		this.registerdate = registerdate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", loginname=" + loginname
				+ ", password=" + password + ", registerdate=" + registerdate + "]";
	}

}
