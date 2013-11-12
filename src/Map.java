import unit.framework.Location;
import java.awt.*;
import javax.swing.*;

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
	
	JLabel label0 = new JLabel("60°/120°");
	JLabel label1 = new JLabel("60°/150°");
	JLabel label2 = new JLabel("60°/180°");
	JLabel label3 = new JLabel("60°/210°");
	JLabel label4 = new JLabel("60°/240°");
	JLabel label5 = new JLabel("60°/270°");
	JLabel label6 = new JLabel("60°/300°");
	JLabel label7 = new JLabel("60°/330°");
	JLabel label8 = new JLabel("60°/0°");
	JLabel label9 = new JLabel("60°/30°");
	JLabel label10= new JLabel("60°/60°");
	JLabel label11= new JLabel("60°/90°");
	JLabel label12= new JLabel("30°/120°");
	JLabel label13= new JLabel("30°/150°");
	JLabel label14= new JLabel("30°/180°");
	JLabel label15= new JLabel("30°/210°");
	JLabel label16= new JLabel("30°/240°");
	JLabel label17= new JLabel("30°/270°");
	JLabel label18= new JLabel("30°/300°");
	JLabel label19= new JLabel("30°/330°");
	JLabel label20= new JLabel("30°/0°");
	JLabel label21= new JLabel("30°/30°");
	JLabel label22= new JLabel("30°/60°");
	JLabel label23= new JLabel("30°/90°");
	JLabel label24= new JLabel("0°/120°");
	JLabel label25= new JLabel("0°/150°");
	JLabel label26= new JLabel("0°/180°");
	JLabel label27= new JLabel("0°/210°");
	JLabel label28= new JLabel("0°/240°");
	JLabel label29= new JLabel("0°/270°");
	JLabel label30= new JLabel("0°/300°");
	JLabel label31= new JLabel("0°/330°");
	JLabel label32= new JLabel("0°/0°");
	JLabel label33= new JLabel("0°/30°");
	JLabel label34= new JLabel("0°/60°");
	JLabel label35= new JLabel("0°/90°");
	JLabel label36= new JLabel("30°/120°");
	JLabel label37= new JLabel("30°/150°");
	JLabel label38= new JLabel("30°/180°");
	JLabel label39= new JLabel("30°/210°");
	JLabel label40= new JLabel("30°/240°");
	JLabel label41= new JLabel("30°/270°");
	JLabel label42= new JLabel("30°/300°");
	JLabel label43= new JLabel("30°/330°");
	JLabel label44= new JLabel("30°/0°");
	JLabel label45= new JLabel("30°/30°");
	JLabel label46= new JLabel("30°/60°");
	JLabel label47= new JLabel("30°/90°");
	JLabel label48= new JLabel("60°/120°");
	JLabel label49= new JLabel("60°/150°");
	JLabel label50= new JLabel("60°/180°");
	JLabel label51= new JLabel("60°/210°");
	JLabel label52= new JLabel("60°/240°");
	JLabel label53= new JLabel("60°/270°");
	JLabel label54= new JLabel("60°/300°");
	JLabel label55= new JLabel("60°/330°");
	JLabel label56= new JLabel("60°/0°");
	JLabel label57= new JLabel("60°/30°");
	JLabel label58= new JLabel("60°/60°");
	JLabel label59= new JLabel("60°/90°");
	
}
