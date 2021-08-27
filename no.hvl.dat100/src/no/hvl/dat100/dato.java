package no.hvl.dat100;

import javax.swing.JOptionPane;

public class dato {
		public static void main (String[] args) {
		String a =	JOptionPane.showInputDialog("Dag: ");
		String b =	JOptionPane.showInputDialog("Mnd: ");
		String c = 	JOptionPane.showInputDialog("År: ");
		int dag = Integer.parseInt(a);
		int mnd = Integer.parseInt(b);
		int aar = Integer.parseInt(c);
		String retur = dag + ":" + mnd + ":" + aar;
		
		if (dag < 1 || dag > 31 || mnd <1 || mnd > 12) {
			JOptionPane.showMessageDialog(null, "error");
		} else {
		JOptionPane.showMessageDialog(null, retur);
}}
}
