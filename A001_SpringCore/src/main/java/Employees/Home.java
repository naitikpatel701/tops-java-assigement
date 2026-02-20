package Employees;

import org.springframework.stereotype.Component;

@Component("home")
public class Home implements Address {

	@Override
	public void empdetalis() {
		// TODO Auto-generated method stub
		System.out.println("Employee Home Address Detalis");
	}

}
