package random;

import javax.swing.JOptionPane;

public class opg3 {
	public static void main (String[] args) {
		int x = 0;
		int teller = 0;
		int teller2 = 0;
		x = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall her: "));
		while (x != 0) {
				teller++;
				teller2 += x;
				x = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall her: "));
			
	}
		System.out.println("Antall tall: " + teller + "\nSum: " + teller2);
}
}
