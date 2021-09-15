package hedopg;

import javax.swing.JOptionPane;

public class input implements Runnable {
	@Override
	public void run(){
		while (!hoved.ut.equals("quit")) {
			hoved.ut = JOptionPane.showInputDialog("");
		}
	}
}
