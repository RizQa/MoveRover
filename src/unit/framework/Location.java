package unit.framework;
import java.util.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Location
{
	static int x;
	static int y;
	
	public Location(int x, int y)

	{
		this.x = x;
		this.y = y;
	}
	
	Location rover = new Location (x,y);
	//Location forward = new Location (x, y+1);
	//Location backward = new Location (x, y-1);
	//Location left = new Location(x-1, y);
	//Location right = new Location (x+1, y);
	
	public static void move(KeyEvent e)
	{
		switch(e.getKeyCode())
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
