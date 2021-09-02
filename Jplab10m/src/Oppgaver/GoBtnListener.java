package Oppgaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GoBtnListener implements ActionListener {

	private JTextArea webpagetextarea;
	private JTextField urltextfield;

	public GoBtnListener(JTextArea webpagetextarea, JTextField urltextfield) {
		this.webpagetextarea = webpagetextarea;
		this.urltextfield = urltextfield;
	}

	public void actionPerformed(ActionEvent e) {

		// URL som bruker har testet inn i addresse-linjen
		String urlstr = urltextfield.getText();

		// skal lagre tekst som vi mottar over nettet via url
		String text = "";

		Scanner in = null;

		/*
		 
			// konstruer URL objekt
			URL url = new URL(urlstr);
			// opprett scanner som kan lese informasjon str�m av tekst fra url'en
			URLConnection connection = url.openConnection();
			in = new Scanner(connection.getInputStream());
			// akkumuler teksten som leses via scanner
			int i = 1;
			while (i <= MyBrowser.MAX_LINES && in.hasNextLine()) {
				String linje = in.nextLine();
				text = text + linje + "\n";
			}
			// legg teksten som er lest fra URL'en inn i hovedvinduet
			webpagetextarea.setText(text);
			if (in != null) {
				in.close();
			}
			
		*/
		
		/* 
		 
		 h�ndter unntak MalformedURLException (Feil format p� URL) og
		 IOException (web siden kunne ikke �pnes) ved � skive ut feilmelding
		 bruk setText metoden p� webpagetextarea-objektet til � sette teksten
		 bruk finally til altid � sette addresse-linjen til den tomme teksten
		 adresse-linjen er representert ved urltextfield
		
        */
	}
}
