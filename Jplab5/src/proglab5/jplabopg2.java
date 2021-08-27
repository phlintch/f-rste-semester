package proglab5;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class jplabopg2 {
	private static int lesInnTall(String m) {
		for (int i = 0; i < 1; i++)
			if (parseInt(m) < 0) {
				m = showInputDialog("repeter, tallet var ikkje positivt");
				i--;
			}
		return parseInt(m);
	}

	public static void main(String[] args) {

		int bredde = lesInnTall(showInputDialog("Bredde:"));
		int hoyde = lesInnTall(showInputDialog("Høyde:"));

		int a = areal(bredde, hoyde);

		showMessageDialog(null, "Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
}
