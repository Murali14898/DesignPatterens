package SingleTonWithThreadSafe;

public class Logger {

	private static volatile Logger loggerInstace = null;

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
