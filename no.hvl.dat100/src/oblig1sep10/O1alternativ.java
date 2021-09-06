package oblig1sep10;

import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;

public class O1alternativ {
	private static DecimalFormat format = new DecimalFormat("#.##");
	public static void main(String[] args) {
		String input = showInputDialog(null, "Din brutto inntekt: ");
		int inntekt = Integer.parseInt(input);
		double skatt = 0;
		if (inntekt < 184800) {
			skatt = 0;
		} else if (inntekt >= 184800 && inntekt < 260100) {
			skatt = inntekt * 0.017;
		} else if (inntekt >= 260100 && inntekt < 651250) {
			skatt = inntekt * 0.04;
		} else if (inntekt >= 651250 && inntekt < 1021550) {
			skatt = inntekt * 0.132;
		}	else if (inntekt < 0){
			showMessageDialog(null, "Lønn kan ikke være negativ.");
			
		}	else {
			skatt = inntekt * 0.162;
		}
		showMessageDialog(null, "Din trinnskatt er på: " + format.format(skatt));
}
}