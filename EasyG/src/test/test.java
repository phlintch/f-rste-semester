package test;
import easygraphics.EasyGraphics;
public class test extends EasyGraphics {
	public static void main (String[] args) {
		launch(args);
	}
	public void run() {
		int i = 0;
		makeWindow("Test",500,500);
		setSpeed(1);
		do {
			
	     setColor(0, 0, 255);
	     int blå = fillRectangle(50, 50, 250, 100);
	     setColor(0, 255, 0);
	     int grønn = fillRectangle(150,50, 250, 100);
	     setColor(255,0,0);
	     int rød = fillRectangle(250,50, 250, 100);
	     moveRectangle(blå, 200, 50);
	     moveRectangle(grønn, 200, 150);
	     moveRectangle(rød, 200, 250);
	     i++;
		} while (i < 10);
	}
}
