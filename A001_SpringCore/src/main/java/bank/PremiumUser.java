package bank;

import org.springframework.stereotype.Component;

@Component("premium")
public class PremiumUser implements User {

	@Override
	public void detalis() {
		// TODO Auto-generated method stub
		System.out.println("Premium User Account Detalis");
	}

}
