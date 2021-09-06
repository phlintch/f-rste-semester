package Oppgaver;

import java.net.MalformedURLException;

import javax.swing.SwingUtilities;

public class StartBrowser {

	public static void main(String[] args) throws MalformedURLException{

		// a bit of voodoo to start the Swing UI thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MyBrowser();
			}
		});
	}
}
