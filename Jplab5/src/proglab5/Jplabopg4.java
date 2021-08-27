package proglab5;

import static javax.swing.JOptionPane.*;

public class Jplabopg4 {
	public static void toString(double[] temp) {
		double fmin = temp[0];
		double fmax = temp[0];
		double min = 0;
		double max = 0;
		double gjennomsnitt = 022
				;
		for (int i = 0; i < 7; i++) {
			gjennomsnitt +=temp[i];
			System.out.println(i+1 + ". dag: " + Math.round(temp[i]));
			if (i == 1) {
				min = Math.min(fmin, temp[i]);
			} else {
				min = Math.min(min, temp[i]);
			}
			if (i == 1) {
				max = Math.min(fmax, temp[i]);
			} else {
				max = Math.min(max, temp[i]);
			}
			
		}
		System.out.println("Min temp over uken = " + min);
		System.out.println("Max temp over uken = " + max);
		System.out.println("Gjennomsnittet for uken var = " + (double) Math.round(gjennomsnitt/7*100)/100);

	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		double[] temp = new double[7];
		for (int i = 0; i < 7; i++) {
			temp[i] = Double.parseDouble(showInputDialog("temp for dag: " + (i+1)));
		}
		toString(temp);
	}
}
