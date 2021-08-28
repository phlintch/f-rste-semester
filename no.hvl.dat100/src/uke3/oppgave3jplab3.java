package uke3;

import static javax.swing.JOptionPane.*;

public class oppgave3jplab3 {
	static double perm = 1.0;

	public static double måte1(double x, int n) {

		return Math.pow(x, n);
	}

	public static double måte2(double x, int n) { // 3*3*3 3^3
		double a = 1.0;
		while (n > 0) {
			a = a * x;
			n--;
		}
		return a;
	}

	public static void main(String[] args) {
		String innverdi1 = showInputDialog("X verdi: ");
		String innverdi2 = showInputDialog("N verdi: ");
		double x = Double.parseDouble(innverdi1);
		int n = Integer.parseInt(innverdi2);
		String fina = "måte 1 = " + måte1(x, n) + "\n" + "måte 2 = " + måte2(x, n);
		showMessageDialog(null, fina);
	}
}
