package uke2;

import javax.swing.JOptionPane;

public class heltall2 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("velg tall 1: ");
		String b = JOptionPane.showInputDialog("velg tall 2: ");
		String c = JOptionPane.showInputDialog("velg tall 3: ");
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int cc = Integer.parseInt(c);
		String retur = "";
		if (Math.min(aa, bb) == aa && Math.min(aa, cc) == aa) {
			retur = retur + aa + ", " + Math.min(bb, cc) + ", " + Math.max(bb, cc);
		} else if (Math.min(aa, bb) == bb && Math.min(bb, cc) == bb) {
			retur = retur + bb + ", " + Math.min(aa, cc) + ", " + Math.max(aa, cc);
		} else {
			retur = retur + cc + ", " + Math.min(aa, bb) + ", " + Math.max(aa, bb);
		}
		System.out.println(retur);

	}
}
