package uke2;

import javax.swing.JOptionPane;

public class sphere {
	public static void main (String[] args) {
		String radiusString = JOptionPane.showInputDialog("Radius: ");
		int radius = Integer.parseInt(radiusString);
		double rad = Math.pow(radius, 3);
		double retur = (4/3)*Math.PI*rad;
		System.out.println(retur);	
	}
}
