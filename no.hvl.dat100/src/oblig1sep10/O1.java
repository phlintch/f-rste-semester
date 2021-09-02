package oblig1sep10;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {
	public static void main(String[] args) {
		String input = showInputDialog(null, "Din brutto inntekt: ");
		int inntekt = Integer.parseInt(input);
		double skatt = 0;
		// Det er anntatt at man bare skal skatte for et intervall p� det man har tjent over intervallet.
		// alts�, om en tjener 1121550 i �ret, skatter man bare 16.2% p� de 100000 man har tjent over. 

		if (inntekt > 1021550) {	// 16.2%

			skatt = skatt + inntekt % 1021550 * 0.162;
			inntekt = inntekt - inntekt % 1021550;
		}
		if (inntekt > 651250 && inntekt <= 1021550) {	// 13.2%
			skatt = skatt + inntekt % 651250 * 0.132;
			inntekt = inntekt - (inntekt % 651250);
		}
		if (inntekt > 260100 && inntekt <= 651250) {	// 4%
			skatt = skatt + inntekt % 260100 * 0.04;
			inntekt = inntekt - (inntekt % 260100);
			skatt = skatt + inntekt%184800*0.017;
			int temp = inntekt;
			if (temp > 260100) {						// denne er ogs� i 1.7% marginen, men bare pga m�ten jeg satt opp 
				skatt = skatt + 230951-184800*0.017;	// koden p� betyr at du ikkje n�dvendigvis setter i gang den neste if l�kken. 
			}
		}
		if (inntekt > 184800 && inntekt <= 260100) {	// 1.7%
			skatt = skatt + inntekt % 184800 * 0.017;
			inntekt = inntekt - inntekt % 184800;
					}
		if (inntekt < 0) {
			showMessageDialog(null, "error");
		}			// 	innser at jeg kanskje har gjort denne oppgaven mye vanskeligere enn den 
					//  trenger � v�re, men antar at det ikkje er et problem.
		showMessageDialog(null, "Du m� skatte en total av: " + Math.round(skatt*100)/100);

	}
}
