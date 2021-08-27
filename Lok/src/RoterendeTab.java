
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RoterendeTab extends JFrame {
	public RoterendeTab() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setTitle("Input Dialog in Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(400, 300);
		getContentPane().setLayout(null);

	}

	private void closeIt() {

		this.getContentPane().setVisible(false);
		this.dispose();

	}

	private static void skrivUt(int[] a) {
		System.out.println(a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3]);
	}

	public static int[] test(int[] a) {
		int ant = a.length;
		int[] ny = a;
		for (int i = 0; i < a.length; i++) {
			ny[i] = ant;

			ant--;
		}
		return ny;
	}

	public static int[] test2(int[] a) {
		int ltg = a.length-1;
		for (int i = 0; i < a.length-1; i++) {
		if (i+1 > a.length) {
			a[i+1] = a[i];
		} else {
			a[0] = a[i];
		}
		}
		return a;
	}

	public static void bestemmer(String a, int[] tab) {
		RoterendeTab frame = new RoterendeTab();
		String b = "flip";
		System.out.println(b);
		String c = "shuffle";
		System.out.println(c);
		if (a == b) {
			skrivUt(test(tab));
			JOptionPane.showMessageDialog(frame, test(tab)[0] + ", " + test(tab)[1] + ", " + test(tab)[2] + ", " + test(tab)[3]);
			frame.closeIt();
		} else if (a == c) {
			skrivUt(test2(tab));
			JOptionPane.showMessageDialog(frame, test2(tab)[0] + ", " + test2(tab)[1] + ", " + test2(tab)[2] + ", " + test2(tab)[3]);
			frame.closeIt();
		} else if (a != b && a != c) {
			JOptionPane.showMessageDialog(frame, "Closing");
			frame.closeIt();
		}
	}

	public static void main(String[] args) {

		String[] a = { "flip", "shuffle", "neither" };
		String n = (String) JOptionPane.showInputDialog(null, "flip or shuffle", "options",
				JOptionPane.QUESTION_MESSAGE, null, a, a[2]);
		System.out.println(n);
		int[] tab1 = { 1, 2, 3, 4 };
		System.out.println(tab1[0] + ", " + tab1[1] + ", " + tab1[2] + ", " + tab1[3]);
		bestemmer(n, tab1);

	}

}
