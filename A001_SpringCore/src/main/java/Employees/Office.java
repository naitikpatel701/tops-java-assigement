package Employees;

import org.springframework.stereotype.Component;

@Component("office")
public class Office implements Address {

	@Override
	public void empdetalis() {
		// TODO Auto-generated method stub
		System.out.println(" Employee Office Address Details");
	}

}
