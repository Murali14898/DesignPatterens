package SingleTonWithThreadSafe;

public class LoggerThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Logger.getLoggerInstace().hashCode());
	}

}
