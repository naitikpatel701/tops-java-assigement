package Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("regular")
public class RegularEmp implements Employee {

	@Autowired
	@Qualifier("home")
	Address address;
	
	@Autowired
	@Qualifier("office")
	Address address1;
	
	
	@Override
	public void empdetalis() {
		// TODO Auto-generated method stub
		System.out.println("Regular Employee Detalis");
		address.empdetalis();
		address1.empdetalis();
	}

}
