package jplab5;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class InputAreal {
	private static int lesInnTall(String message) {
		return parseInt(message);
	}
	public static void main(String[] args) {
		
		int bredde =lesInnTall(showInputDialog("Bredde:"));

		int hoyde = lesInnTall(showInputDialog("Høyde:"));
		
		

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
		
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
}
