package Employees;

import org.springframework.stereotype.Component;

@Component("contract")
public class ContractEmp implements Employee {

	@Override
	public void empdetalis() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee Details");
	}

}
