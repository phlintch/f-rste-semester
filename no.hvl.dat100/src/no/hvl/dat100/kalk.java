package no.hvl.dat100;

import javax.swing.JOptionPane;

public class kalk {
	public static void main(String[] args) {
		String lengde = JOptionPane.showInputDialog("Lenge av rektangelet");
		String bredde = JOptionPane.showInputDialog("Bredde av rektangelet");
		int leng = Integer.parseInt(lengde);
		int bred = Integer.parseInt(bredde);
		JOptionPane.showMessageDialog(null, leng*bred);
	}
}
