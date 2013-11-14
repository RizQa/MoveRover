import unit.framework.Location;
import java.awt.event.KeyEvent;

public class Rover
{
	public void Location (int x, int y)
	{
		x= Location.getX();
		y= Location.getY();
	}
	char[] Commands = new char []{'N','S','E','W'};
	public static void moveRover(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_N:
			Location.setLocation(Location.getX(), Location.getY()+1);
			break;
		
		case KeyEvent.VK_S:
			Location.setLocation(Location.getX(), Location.getY()-1);
			break;
			
		case KeyEvent.VK_W:
			Location.setLocation(Location.getX()+1, Location.getY());
			break;
			
		case KeyEvent.VK_E:
			Location.setLocation(Location.getX()-1, Location.getY());
			break;
	}
	}
}
