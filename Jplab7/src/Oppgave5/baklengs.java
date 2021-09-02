package Oppgave5;

public class baklengs {

	public static void main(String[] args) {
		String a = "abcdefg";
		int b = a.length();
		String retur = "";
	
		for (int i = b-1; i >= 0; i--) {
			retur += a.charAt(i);
		}
		System.out.println(retur);
	}

}
