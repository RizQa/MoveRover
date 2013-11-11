import java.awt.event.KeyEvent;
import org.junit.Test;
import unit.framework.Location;


public class MoveRoverTest extends junit.framework.TestCase {

	public void test () 
	{
		Rover MarsRover = new Rover();
		Map MarsMap = new Map();
	}
	public void KeyPressed (KeyEvent e)
{
		int x = 0;
		int y = 0;
		switch (e.getKeyCode())
		{
		case KeyEvent.VK_N:
			Location forward = new Location (x, y+1);
			break;
		
		case KeyEvent.VK_S:
			Location backward = new Location (x, y-1);
			break;
			
		case KeyEvent.VK_W:
			Location left = new Location(x-1, y);
			break;
			
		case KeyEvent.VK_E:
			Location right = new Location (x+1, y);
			break;
		}
	
	}
}


