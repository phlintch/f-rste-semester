package uke2;

import static javax.swing.JOptionPane.*;

public class karakter01 {
	public static void main (String[] args) {
		String full = "";
		String temp = "";
		for (int i = 1; i <= 10;i++) {
		String brukerIn = showInputDialog("Student " +  i + " sin poengsum: ");
		int poengSum = Integer.parseInt(brukerIn);
		if (poengSum <= 100 && poengSum >= 0) {
			if (poengSum <= 100 && poengSum >= 90) {
				showMessageDialog(null,"Karakter: A");
				temp = "Student " + i + " Karakter: A";
			} else if (poengSum <= 89 && poengSum >= 80) {
				showMessageDialog(null,"Karakter: B");
				temp = "Student " + i + " Karakter: B";
			} else if (poengSum <= 79 && poengSum >= 60) {
				showMessageDialog(null, "Karakter: C");
				temp = "Student " + i + " Karakter: C";
			} else if (poengSum <= 59 && poengSum >= 50) {
				showMessageDialog(null,"Karakter: D");
				temp = "Student " + i + " Karakter: D";
			} else if (poengSum <= 49 && poengSum >= 40) {
				showMessageDialog(null,"Karakter: E");
				temp = "Student " + i + " Karakter: E";
			} else {
				showMessageDialog(null, "Karakter: F");
				temp = "Student " + i + " Karakter: F";
			}
			if (full != "") {
			full = full + "\n" + temp;
			} else {
				full = temp;
			}
		} else {
			showMessageDialog(null,"Ugyldig Karakter\nSkriv poengsum inn igjen");
			i--;
		}
		
		}
		showMessageDialog(null, full);
	}
}
