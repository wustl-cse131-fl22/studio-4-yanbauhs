package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.clear();
	
	StdDraw.setPenColor(Color.YELLOW);
	StdDraw.filledRectangle(0,0,100,100);
	
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.filledRectangle(.25, .75, .05, .05);
	
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.filledRectangle(.75, .75, .05, .05);
	
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.filledRectangle(.5, .5, .3, .05);
	
	
	
	
	
	}
}