package bank;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount  implements Account{

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Current Account Detalis");
	}

}
