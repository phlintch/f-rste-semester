package no.hvl.dat100;

import javax.swing.JOptionPane;

public class vekslepenger {
	public static void main (String[] args) {
		String inn = JOptionPane.showInputDialog("Pris: ");
		int pris = Integer.parseInt(inn);
		String belopb = JOptionPane.showInputDialog("Beløp betalt: ");
		int belop = Integer.parseInt(belopb);
		int summ = belop - pris;
		int tiere = summ/10;
		int enere = summ%10;
		JOptionPane.showMessageDialog(null, "Retur: \n"+"tiere: " + tiere + "\nenere: " + enere);
	}
}
