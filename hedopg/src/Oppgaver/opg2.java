package Oppgaver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;
public class opg2 {



	

		static String MAPPE_STR = System.getProperty("user.dir") + "/src/Oppgaver/";

		static public void main(String[] args) throws FileNotFoundException {
			int fors�k = 3;
			boolean finnes = false;
			String input = "";
			while (fors�k > 0) {
				if (fors�k == 3) {
					input = showInputDialog("Filnavn:");
				} else {
					input = showInputDialog("Feil, "+fors�k+" fors�k gjennst�r\n"+"Filnavn:" );
				}
			File test = new File(MAPPE_STR+input);
			if (test.exists()) {
				fors�k = 0;
			} else {
				fors�k--;
			}
			
			}
			try {
				
				String filnavn;

				filnavn = input;

				File file = new File(MAPPE_STR + filnavn);
				BufferedReader reader = new BufferedReader(new FileReader(file));

				int linenumber = 1;

				// les innhold i filen linje for linje
				String line;

				while ((line = reader.readLine()) != null) {
					System.out.println(linenumber + " " + line);
					linenumber++;
				}

				reader.close();
			} catch (Exception e) {
				showMessageDialog(null, "filen eksisterer ikke\n"+fors�k+" fors�k gjennst�r.");

			}
			// JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes
			// ikke. \n" + e.getMessage());
		}
	}

