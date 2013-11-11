package unit.framework;

public class Location {
	
	double x;
	double y;
	
	Location(double x, double y)

	{
		this.x = x;
		this.y = y;
		
	}
	
	Location rover = new Location (x,y);
	Location forward = new Location (x, y+1);
	Location backward = new Location (x, y-1);
	Location left = new Location(x-1, y);
	Location right = new Location (x+1, y);
	
}
