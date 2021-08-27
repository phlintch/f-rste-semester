package Kap1;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import java.io.*;

public class FinnOrdIFil {
	public static void main(String[] args) {
		String filnavn = showInputDialog("Filnavn:");
		String søkeord = showInputDialog("Søkeord:");
		try {
			BufferedReader fil = new BufferedReader(new FileReader(filnavn));
			String linje = fil.readLine();
			int linjenr = 1;
			while (linje != null) {
				if (linje.contains(søkeord)) {
					out.println(linjenr+":"+linje);					
				}
				linje = fil.readLine();
				linjenr = linjenr+1;
			}
			fil.close();
		}
		catch (Exception e ) {
			out.println("Problem med "+filnavn);
		}
		
	}
}
