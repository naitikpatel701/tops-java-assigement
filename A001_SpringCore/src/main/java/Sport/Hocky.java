package Sport;

import org.springframework.stereotype.Component;

@Component("hocky")
public class Hocky implements Sports {

	@Override
	public void Sport() {
		// TODO Auto-generated method stub
		System.out.println("Hocky Detalis...");
	}

}
