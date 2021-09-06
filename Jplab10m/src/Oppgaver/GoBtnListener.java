package Oppgaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GoBtnListener implements ActionListener {

	private JTextArea webpagetextarea;
	private JTextField urltextfield;

	public GoBtnListener(JTextArea webpagetextarea, JTextField urltextfield) {
		this.webpagetextarea = webpagetextarea;
		this.urltextfield = urltextfield;
	}

	public void actionPerformed(ActionEvent e)	 {
		String urlstr = urltextfield.getText();
		urltextfield.setText(null);
		String text = "";
		Scanner in = null;
		try {
		

			URL url = new URL(urlstr);
			URLConnection connection = url.openConnection();
			in = new Scanner(connection.getInputStream());
		
		} catch (MalformedURLException a) {
			webpagetextarea.setText("Malformed URL Exception caught.");
		} catch (IOException b) {
			webpagetextarea.setText("Site does not exist");
		} finally {
			int i = 1;
			while (i <= MyBrowser.MAX_LINES && in.hasNextLine()) {
				String linje = in.nextLine();
				text = text + linje + "\n";
			}
			webpagetextarea.setText(text);
			
			if (in != null) {
				in.close();
			}
		}
		
		
		} 
		
		
}
