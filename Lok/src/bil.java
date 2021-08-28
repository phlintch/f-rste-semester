import javax.swing.JOptionPane;

public class bil {
	public static void main(String[] args) {
		hoved();
		int dekk[] = {215,45,17};
		
	}
	public static void hoved() {
		String W = JOptionPane.showInputDialog(null, "Tire width?");
		String Pros = JOptionPane.showInputDialog(null, "Percentage of tire width?");
		String Felg = JOptionPane.showInputDialog(null, "Rim? (Inches)");
		String ErrorM = JOptionPane.showInputDialog(null, "Error margin (Percentage)");
		int width = Integer.parseInt(W);
		double width2 = Double.parseDouble(Pros);
		int felge = Integer.parseInt(Felg);
		double Error = Double.parseDouble(ErrorM);
		double prsnt = width2/100;
		double w2 = width*prsnt;
		double FC = felge*25.4;
		double C = Size(w2,FC);
		double ideal = ideal(Error, C);
		JOptionPane.showMessageDialog(null, "Current circumference " +C);
		JOptionPane.showMessageDialog(null, "the ideal tire circumference is \n: " + ideal);
	}
	public static double Size (double w2,double f) {
		double dim = w2+w2+f;
		double circ = dim*3.14159265359;
		return circ;
	}
	public static double ideal (double error, double c) {
		double E = error/100;
		double e = 1-E;
		return c*e;
	}
	
		

}
