package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class flagg extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Det tyske flagget");

		setColor(0, 0, 0);
		fillRectangle(50, 50, 400, 100);
		setColor(255, 0, 0);
		fillRectangle(50, 150, 400, 100);
		setColor(241, 215, 28);
		fillRectangle(50, 250, 400, 100);
		setColor(0, 0, 0);
		drawRectangle(50, 50, 400, 300);
	}

}
