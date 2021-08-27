package proglab5;
import easygraphics.EasyGraphics;
public class jplabopg5 extends EasyGraphics {
	public static void main (String[] args) {
	launch(args);
}
		public void run() {
			int teller = 0;
			int radius;
			makeWindow("blink",500,500);
			for (radius = 200; radius > 0; radius-=40) {
				if (teller == 0) {
					setColor(0,0,0);
					teller++;
				} else {
					setColor(255,255,255);
					teller--;
				}
				fillCircle(250,250,radius);
				
			}
		}
}
