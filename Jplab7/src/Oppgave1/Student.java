package Oppgave1;
import static java.lang.System.out;
public class Student {
	
	int studNr;
	String fornavn;
	String etternavn;
	public Student(int studNr, String fornavn, String etternavn) {
		this.studNr = studNr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		
	}
	public void skrivUt () {
		out.println(studNr + " : " + fornavn + " " + etternavn);
	}
	public String navn() {
		return etternavn + ", " + fornavn;
	}
	public void endreEtternavn (String nyttE) {
		etternavn = nyttE;
	}
	
	public static void main (String[] args) {
		Student s1 = new Student(1, "Magnus", "Henningsen");
		Student s2 = s1;
		
	}
}
