package uke3;

import javax.swing.JOptionPane;

public class fakultet {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall:"));
		int x = 0;
		int i = 1;
		while (i < n) {
			if (i == 1) {
				x = i * (i + 1);
			} else {
				x = x * (i + 1);
			}
			i++;
		}
		JOptionPane.showMessageDialog(null, x);
	}
}
