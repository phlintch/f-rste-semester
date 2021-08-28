package uke3;
import static javax.swing.JOptionPane.*;
public class oddetall {
public static void main (String[] args) {
	String a = showInputDialog("Grense nr 1: ");
	String b = showInputDialog("Grense nr 2: ");
	int grense1 = Integer.parseInt(a);
	int grense2 = Integer.parseInt(b);
	int min = Math.min(grense1, grense2);
	int max = Math.max(grense1, grense2);
	String retur = "";
	for (int i = min; i < max;) {
		if (i%2 != 0) {
			if (retur != "") {
			retur = retur + ", " + i;
			i++;
			} else {
				retur = retur + i;
				i++;
			}
		} else {
			i++;
		}
	}	System.out.println(retur);
}
}
