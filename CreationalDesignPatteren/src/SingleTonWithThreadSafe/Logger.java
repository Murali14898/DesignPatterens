package SingleTonWithThreadSafe;

public class Logger {

	private static volatile Logger loggerInstace = null;
	//volatile prevents instruction reordering and ensures that all threads see the fully initialized object.
	private Logger() {
	}

	public static Logger getLoggerInstace() {
		if (loggerInstace == null) {
			synchronized (Logger.class) {
				if (loggerInstace == null) {
					loggerInstace = new Logger();
				}
			}
		}
		return loggerInstace;
	}

}
