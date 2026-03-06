package SingleTonWithThreadSafe;

public class Main {

	public static void main(String[] args) {
		Runnable r = new LoggerThread();
		for(int i=1;i<1000;i++) {
			Thread t = new Thread(r);
			t.start();
		}
	}

}
