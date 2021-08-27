package uke2;

import javax.swing.JOptionPane;

public class heltall {
	public static void main (String[] args) {
		String a = JOptionPane.showInputDialog("velg tall 1: ");
		String b = JOptionPane.showInputDialog("velg tall 2: ");
		String c = JOptionPane.showInputDialog("velg tall 3: ");
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int cc = Integer.parseInt(c);
		String retur = "";
		boolean temp = false;
		if (Math.min(aa, bb) == aa && Math.min(aa, cc) == aa) {
			retur = retur + aa + ", ";
			temp = true;
		} 
		if (temp) {
			retur = retur + Math.min(bb, cc) + ", " + Math.max(bb, cc);
			System.out.println(retur);
		}
		if (!temp && Math.min(bb, cc) == bb) {
			temp = true;
			retur = retur + bb + ", ";
			if (temp) {
				retur = retur + Math.min(aa, cc) + ", " + Math.max(aa, cc);
				System.out.println(retur);
			}
		}
		if (!temp) {
			retur = retur + cc + ", " + Math.min(aa, bb) + ", " + Math.max(aa, bb);
			System.out.println(retur);
		}
		
	}
}
