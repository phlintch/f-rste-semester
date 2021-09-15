package hedopg;

public class hoved {
	public static String ut = "Hello world";

	public static void main(String[] args) throws InterruptedException {
		Thread x = new Thread(new input());
		Thread t = new Thread(new MinTraad());
		x.start();
		t.start();	
	}	
}



