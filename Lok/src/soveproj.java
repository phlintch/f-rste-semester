import static javax.swing.JOptionPane.*;

import java.io.*;

public class soveproj {

	public static String[] tabprod(String linje) { 	// overføre tekstfil til tabell
		String[] a = null;
		int x = 0;
		for (int i = 0; i < linje.length(); i++) {
			if (linje.charAt(i) != '#' || linje.charAt(i) != '|') {
				a[x] = a[x] + linje.charAt(i);
			} else {
				x++;
			}

		}
		return a;
	}

	
	public static void main(String[] args) {
		String filnavn = showInputDialog("navn på tekstfil: ");
		String[][] hoved = null;
		try {
			int rad = 0;
			BufferedReader leser = new BufferedReader(new FileReader(filnavn));
			String linje = leser.readLine();
			while (leser.readLine() != null) {
				for (int i = 0; i < tabprod(linje).length-1; i++) {
					hoved[rad][i] = tabprod(linje)[i];
				}
				
				linje = leser.readLine();
					rad++;
			}
			showMessageDialog(null, "rett" + hoved[0][1]);
			leser.close();
		} catch (Exception e) {
			showMessageDialog(null, "feil");
		}

	}
}
