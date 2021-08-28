package uke2;

import static javax.swing.JOptionPane.*;

public class deling {
	public static void main(String[] args) {
		String a1 = showInputDialog("verdi a");
		String b1 = showInputDialog("verdi b"); 
		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);			// undervisningsplan på canvas
		if (b == 0) {
			showMessageDialog(null, "error");
		} else {
			showMessageDialog(null, a / b);
		}
	}
}
