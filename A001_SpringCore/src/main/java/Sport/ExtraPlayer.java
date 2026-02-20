package Sport;

import org.springframework.stereotype.Component;

@Component("extra")
public class ExtraPlayer implements Player {

	@Override
	public void player() {
		// TODO Auto-generated method stub
		System.out.println("Extra Player detalis");
	}

}
