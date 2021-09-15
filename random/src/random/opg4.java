package random;

public class opg4 {
	public static int minst(int a, int b, int c) {
		return Math.min(Math.min(a, b), Math.min(b, c));
	}
	public static void main (String[] args) {
		System.out.println(minst(1,2,3));
	}
}
