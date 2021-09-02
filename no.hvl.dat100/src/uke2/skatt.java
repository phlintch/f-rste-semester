package uke2;

import static javax.swing.JOptionPane.*;

public class skatt {
	public static void main(String[] args) {
		String input = showInputDialog(null, "Din brutto inntekt: ");
		int inntekt = Integer.parseInt(input);
		double skatt = 0;
		// skatte niv�: 0 - 164100 = 0% 164101-230950 = 0,93% 230951-580650 = 2,41%
		// 580651-934050 = 11,52%
		// 934051 -> = 14,52%
		// er noe feil med matten her tror eg, kan v�re bedre med en catch funksjon?
		// det er antatt at skattingen skal skje trinnvis i denne beregningen, alst�:
		// om du tjener over 940k, vil du bare skatte 14.52% p� det du har tjent over 
		// mens resten av din tidligere l�nn vil bli skattet i intervaller.
		// gj�r det om til dagens skatte tall og legg det inn i en tabell og hent verdiene derfra for � gj�re
		// det mer effektivt / ryddig 

		if (inntekt > 1021550) {

			skatt = skatt + inntekt % 1021550 * 0.162;
			inntekt = inntekt - inntekt % 1021550;
		}
		if (inntekt > 651250 && inntekt <= 1021550) {
			skatt = skatt + inntekt % 651250 * 0.132;
			inntekt = inntekt - (inntekt % 651250);
		}
		if (inntekt > 260100 && inntekt <= 651250) {
			skatt = skatt + inntekt % 260100 * 0.04;
			inntekt = inntekt - (inntekt % 260100);
			skatt = skatt + inntekt%184800*0.017;
			int temp = inntekt;
			if (temp > 260100) {
				skatt = skatt + 230951-184800*0.017;
			}
		}
		if (inntekt > 184800 && inntekt <= 260100) {
			skatt = skatt + inntekt % 184800 * 0.017;
			inntekt = inntekt - inntekt % 184800;
					}
		if (inntekt < 0) {
			showMessageDialog(null, "error");
		}			// 	Ikkje 100% p� om alt dette er rett, m� sjekkes f�r innlevert.
		showMessageDialog(null, "Du m� skatte en total av: " + Math.round(skatt*100)/100);

	}
}
