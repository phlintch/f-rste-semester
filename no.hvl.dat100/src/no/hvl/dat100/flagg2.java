package no.hvl.dat100;

import easygraphics.EasyGraphics;
import static javax.swing.JOptionPane.*;

public class flagg2 extends EasyGraphics {
	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void run() {
		double x = (Double.parseDouble(showInputDialog("% av original størrelse: ")) / 100);
		double a = 300 * x;
		double b = 400 * x;
		int hoyde = (int) a;
		int bredde = (int) b;
		makeWindow("Skalerende vindu");
		setColor(0, 0, 0);

		fillRectangle(50, 50, bredde, hoyde / 3);
		setColor(255, 0, 0);
		fillRectangle(50, 50 + hoyde / 3, bredde, hoyde / 3);
		setColor(241, 215, 28);
		fillRectangle(50, 50 + ((hoyde / 3) * 2), bredde, hoyde / 3);
		setColor(0, 0, 0);
		drawRectangle(50, 50, bredde, hoyde);
	}
}
