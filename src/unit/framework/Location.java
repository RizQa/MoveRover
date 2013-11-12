package unit.framework;

public class Location
{
	static int x;
	static int y;
	
	public Location(int x, int y)

	{
		this.x = x;
		this.y = y;
	}
	public static int getX()
	{
		return x;
	}
	public static int getY()

	{
		return y;
	}
	public void setX (int i)
	{
		x= i;
	}
	public void setY (int i)
	{
		y= i;
	}	
	/*public static void move(KeyEvent e)

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
	}*/
	public static void setLocation(int x, int y)
	{
		Location rover = new Location (x,y);
	}
}
