package uke2;

import static javax.swing.JOptionPane.*;

public class skatt {
	public static void main(String[] args) {
		String input = showInputDialog(null, "Din brutto inntekt: ");
		int inntekt = Integer.parseInt(input);
		double skatt = 0;
		// skatte nivå: 0 - 164100 = 0% 164101-230950 = 0,93% 230951-580650 = 2,41%
		// 580651-934050 = 11,52%
		// 934051 -> = 14,52%
		// er noe feil med matten her tror eg, kan være bedre med en catch funksjon?
		// det er antatt at skattingen skal skje trinnvis i denne beregningen, alstå:
		// om du tjener over 940k, vil du bare skatte 14.52% på det du har tjent over 
		// mens resten av din tidligere lønn vil bli skattet i intervaller.
		// gjør det om til dagens skatte tall og legg det inn i en tabell og hent verdiene derfra for å gjøre
		// det mer effektivt / ryddig 

		if (inntekt > 934051) {

			skatt = skatt + inntekt % 934051 * 0.1452;
			inntekt = inntekt - inntekt % 934051;
		}
		if (inntekt > 580651 && inntekt <= 934051) {
			skatt = skatt + inntekt % 580651 * 0.1152;
			inntekt = inntekt - (inntekt % 580651);
		}
		if (inntekt > 230951 && inntekt <= 580651) {
			skatt = skatt + inntekt % 230951 * 0.0241;
			inntekt = inntekt - (inntekt % 230951);
			skatt = skatt + inntekt%164100*0.0093;
			int temp = inntekt;
			if (temp > 230951) {
				skatt = skatt + 230951-164100*0.0093;
			}
		}
		if (inntekt > 164100 && inntekt <= 230951) {
			skatt = skatt + inntekt % 164100 * 0.0093;
			inntekt = inntekt - inntekt % 164100;
					}
		if (inntekt < 0) {
			showMessageDialog(null, "error");
		}			// 	Ikkje 100% på om alt dette er rett, må sjekkes før innlevert.
		showMessageDialog(null, "Du må skatte en total av: " + skatt);

	}
}
