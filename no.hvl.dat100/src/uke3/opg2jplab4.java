package uke3;

import easygraphics.EasyGraphics;

public class opg2jplab4 extends EasyGraphics {
	// A-klassen er 28 %, i B-klassen er den 38 % og i C klassen er den 46 %
	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Klasse fordeling:", 700, 400);
		int ga = (int) (600 * 0.28);
		int gb = (int) (600 * 0.38);
		int gc = (int) (600 * 0.46);
		setFont("calibri", 25);
		drawString("Klasse A", 320,48);
		drawString("Klasse B", 320,123);
		drawString("Klasse C", 320,198);
		setFont("calibri", 12);
		drawString("28% gutter", 50,110);
		drawString("38% gutter", 50,185);
		drawString("46% gutter", 50,260);
		drawString("72% jenter", 600,110);
		drawString("62% jenter", 600,185);
		drawString("54% jenter", 600,260);
		setColor(0, 0, 0);
		
		setColor(0, 200, 0);
		fillRectangle(50, 50, ga, 50);
		fillRectangle(50, 125, gb, 50);
		fillRectangle(50, 200, gc, 50);
		setColor(220, 0, 0);
		fillRectangle(50+ga, 50, 600-ga, 50);
		fillRectangle(50+gb, 125, 600-gb, 50);
		fillRectangle(50+gc, 200, 600-gc, 50);
		drawRectangle(50, 50, 600, 50);
		drawRectangle(50, 125, 600, 50);
		drawRectangle(50, 200, 600, 50);
	}
}
