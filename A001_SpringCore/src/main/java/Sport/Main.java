package Sport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cx=new AnnotationConfigApplicationContext(Appconfig.class);
		
		Sports sport=cx.getBean("cricket",Sports.class);
		sport.Sport();
		
		Sports sport1=cx.getBean("hocky",Sports.class);
		sport1.Sport();
	}

}
