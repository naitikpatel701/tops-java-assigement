package Sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cricket")
public class Cricket implements Sports {
    
	@Autowired
	@Qualifier("reugler")
	Player player;
	
	
	@Autowired
	@Qualifier("extra")
	Player player1;
	
	@Override
	public void Sport() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Detalis...");
		player.player();
		player1.player();
	}

}
