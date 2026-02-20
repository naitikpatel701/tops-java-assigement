package bank;

import org.springframework.stereotype.Component;

@Component("normal")
public class NormalUser implements User {

	@Override
	public void detalis() {
		// TODO Auto-generated method stub
		System.out.println("Normal User Account Detalis");
	}

}
