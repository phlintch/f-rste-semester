package no.hvl.dat100;

import javax.swing.JOptionPane;

public class min {
	public static void main (String[] args) {
		String a = JOptionPane.showInputDialog("tall 1");
		String b = JOptionPane.showInputDialog("tall 2");
		String c = JOptionPane.showInputDialog("tall 3");
		String d = JOptionPane.showInputDialog("tall 4");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		int d1 = Integer.parseInt(d);
		int ab = Math.min(a1, b1);
		int cd = Math.min(c1, d1);
		int resultat = Math.min(ab, cd);
		JOptionPane.showMessageDialog(null, resultat);
	}
}
