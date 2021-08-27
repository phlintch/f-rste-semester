package no.hvl.dat100;

import javax.swing.JOptionPane;

public class SekundConv {
	public static void main (String[] args) {
		String gittTid = JOptionPane.showInputDialog("Antall sekunder du vil konvertere: ");
		int startSek = Integer.parseInt(gittTid);
		int time = startSek/3600;
		int minutt = startSek%3600/60;
		int sek = startSek%60;
		
		System.out.println("hr: "+time + " min: " + minutt + " sek: " + sek);
	}
}
