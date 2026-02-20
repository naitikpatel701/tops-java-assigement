package bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cx=new AnnotationConfigApplicationContext(Appconfig.class);
		
		Account account=cx.getBean("saving",Account.class);
		account.deposite();
		
		Account ac=cx.getBean("currentAccount",Account.class);
		ac.deposite();
	}

}
