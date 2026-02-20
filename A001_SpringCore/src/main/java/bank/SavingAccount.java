package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Account {

	@Autowired
	@Qualifier("normal")
	User user;
	
	@Autowired
	@Qualifier("premium")
	User u;
	
	@Override
	public void deposite() {
		// TODO Auto-generated method stub
	System.out.println("Saving Account Detalis");
	user.detalis();
	u.detalis();
	}

}
