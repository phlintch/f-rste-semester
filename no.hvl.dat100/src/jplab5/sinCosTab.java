package jplab5;

public class sinCosTab {
	public static void main (String[] args) {
		System.out.println("vinkel: "+"	"+"Radian: "+"	"+"Sin: "+"		"+"Cos: ");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i<=180;i= i+15) {
			double x = Math.PI*i/180;
			System.out.print(i+"		"+(double)Math.round(x)+"		"+(double)Math.round(Math.sin(x)*1000)/1000+"		"+(double)Math.round(Math.cos(x)*1000)/1000+"\n");
		}
		System.out.println("-----------------------------------------------------");
	}
}
