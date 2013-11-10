import java.awt.event.KeyEvent;
import org.junit.Test;


public class MoveRoverTest extends junit.framework.TestCase {

	@Test
	public void test () {
		Rover MarsRover = new Rover();
		Map MarsMap = new Map();
	}
	public void KeyPressed (KeyEvent e){
		switch (e.getKeyCode())
		{
		case KeyEvent.VK_UP:			//North
			
			//move.setLocation ((int)move.getLocation().getX(), (int)move.getLocation().getY()+30);	
			break;
			
		case KeyEvent.VK_DOWN:			//South
			//move.setLocation ((int)move.getLocation().getX(), (int)move.getLocation().getY()-30);
			break;
		case KeyEvent.VK_LEFT:			//West
			//move.setLocation ((int)move.getLocation().getX()-30, (int)move.getLocation().getY());
			break;
		case KeyEvent.VK_RIGHT: 		//East
			//move.setLocation ((int)move.getLocation().getX()+30, (int)move.getLocation().getY());
			break;
		}
	
	}
}


