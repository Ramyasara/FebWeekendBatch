package org.test2.login;

import org.test1.login.Company;
import org.test1.login.Employee;

public class Client {
	private void ClientId() {
		System.out.println("Client ID is 101");

	}
	private void ClientName() {
		System.out.println("Client Name is Sara");

	}
	public static void main(String[] args) {
		Client a = new Client();
		a.ClientId();
		a.ClientName();
		
		Employee e = new Employee();
		e.Empid();
		e.Empname();
		
		Company c = new Company();
		c.CompanyId();
		c.CompanyName();
		
	}

}
