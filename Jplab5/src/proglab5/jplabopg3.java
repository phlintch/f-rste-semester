package proglab5;

import easygraphics.EasyGraphics;

public class jplabopg3 extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		// tegn en murvegg hvor annenhver linje begynner med en halv murstein
		int bredde = 1050;
		int hoyde = 300;
		int startX = 50;
		int startY = 50;

		makeWindow("murvegg", 1500, 500);

		setColor(0, 0, 0);
		for (int x = 1; x <= 4; x++) {
			if (x % 2 == 1) {
				for (bredde = 1050; bredde > 0;) {
					if (bredde > 100) {
						drawRectangle(startX, startY, 100, hoyde / 4);
						startX = startX + 100;
						bredde = bredde - 100;
					} else if (bredde < 100 && bredde != 0) {
						drawRectangle(startX, startY, bredde, hoyde / 4);
						startX = 50;
						bredde = 0;
						startY = startY + hoyde / 4;
					}
				}
			} else {
				for (bredde = 1050; bredde > 0;) {
					if (startX < 100) {
						drawRectangle(startX, startY, 50, hoyde / 4);
						startX += 50;
						bredde -= 50;

					} else {
						drawRectangle(startX, startY, 100, hoyde / 4);
						startX += 100;
						bredde -= 100;
						if (bredde == 0) {
							startX = 50;
							startY += hoyde / 4;
						}
					}
				}
			}

		}
	}

}
