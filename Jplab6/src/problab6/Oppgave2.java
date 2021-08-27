package problab6;
import easygraphics.EasyGraphics;

	public class Oppgave2 extends EasyGraphics {

		// nesten dekket hvis mindre en fra havoverflaten
		int NESTEN_DEKKET = 1;
		int RADIUS = 20;
		int MARGIN = 50;

		// terreng hogde
		int[][] terreng = { { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
							{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
							{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 }};

		public static void main(String[] args) {
			launch(args);
		}

		public void run() {

			makeWindow("FLOODING", 800, 300);

			visualiser();
		}

		public void visualiser() {

			System.out.println("Angi havhøyde i tegnevinduet ...");
			int hav = Integer.parseInt(getText("havhøyde"));

			while (hav >= 0) {
					for (int i = 0; i < terreng.length; i++) {
						for (int j = 0; j < terreng[i].length;j++) {
							if (terreng[i][j]-hav <= 0) {
								setColor(0,0,255);
								
							} else if (terreng[i][j]-hav > 0 && terreng[i][j]-hav < 2) {
								setColor(255,140,0);
							} else {
								setColor(222,184,135);
							}
							fillCircle(MARGIN + RADIUS*j*2,MARGIN + RADIUS*i*2,RADIUS);
						}
						
					}
					System.out.println("Angi havhøyde i tegnevinduet ...");
					hav = Integer.parseInt(getText("havhøyde"));
			}
		}
	}
	
