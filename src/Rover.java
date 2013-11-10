import java.util.Arrays;
import java.lang.Object;
import javax.activation.CommandObject;
import java.awt.*;

public class Rover extends Map
{
	public String name;
	char[]Commands = new char []{'N','S','E','W'};
	double x;
	double y;
	void Location(double x, double y)

	{
		return;
	}
	public void setLocation (double x, double y) 
	{
		return;
	}
	public void getLocation (double x, double y)
	{
	return; 
	}
	public void moveRover()
	{
			if(Command == 'N')
			{
				setLocation ((double).getLocation().getx(), (double)move.getLocation().gety()+1);	
			}
			else if(Command == 'S')
			{
			}
			else if(Command == 'E')
			{
			}
			else if(Command == 'W')
			{
			}
		}
	private char getDirection()
	{
		return getDirection();
	}
	//public void CommandObject (char c, int i) {
		//CommandObject ObjectToNorth = new CommandObject('N',0);
		//CommandObject ObjectToSouth = new CommandObject('S',0);
		//CommandObject ObjectToEast = new CommandObject('E',0);
		//CommandObject ObjectToWest = new CommandObject('W',0);		
}