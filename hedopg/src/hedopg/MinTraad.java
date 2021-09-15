package hedopg;

import javax.swing.JOptionPane;

public class MinTraad implements Runnable {

	@Override
	public void run() {

		while (!hoved.ut.equals("quit")) {

			System.out.println(hoved.ut);

			try {

				Thread.sleep(3000);
			} catch (InterruptedException ignored) {
			}
		}
	}
}
