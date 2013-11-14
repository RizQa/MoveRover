import unit.framework.Location;

public class Map extends Location
{
	public Map(int column, int row) {
		super(column, row);
	}

	int [][] a = new int [5][12]; //ein Array mit 5 Zeilen und 12 Spalten für die Darstellung der Marsoberfläche.
	int [][] marsmap = {	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
							{12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23},
							{24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35},
							{36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47},
							{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59} };

	public static void wrapping (int w) //Implement wrapping from one edge of the grid to another. (planets are spheres after all)
	{
			//North
			{if (w>=12)
			{
				w= w-12; 
			}
			else 
			{
				w= w+48;	//Wenn der Rover im oberen Array in der ersten Zeile steht, muss er wenn er weiter 
							//nach Norden fährt in der letzten Zeile wieder rauskommen.
			}
			}
			
			//South
			{if (w<=47)
			{
				w= w+12;
			}
			else
			{
				w= w-48;  	//Wenn der Rover in der letzten Zeile steht und weiter nach Süden will, muss er oben in der ersten Zeile wieder rauskommen.
			}
			}
		switch (w)
		{
		//East : Wenn der Rover in der letzten Spalte steht, weiter nach Osten fährt, kommt er in der ersten Spalte des Arrays wieder raus.
		case 11: w= w-11;
		break;
		case 23: w= w-11;
		break;
		case 35: w= w-11;
		break;
		case 47: w= w-11;
		break;
		case 59: w= w-11;
		break;
		//West : siehe oben, das gleiche Verhalten, nur umgekehrt. 
		case 0:	w= w+11;
		break;
		case 12:	w= w+11;
		break;
		case 24:	w= w+11;
		break;
		case 36:	w= w+11;
		break;
		case 48:	w= w+11;
		break;
		}
	}
}