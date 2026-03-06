package SingleTon;

public class DbConn {
	private static DbConn instance = null;
	private DbConn() {}
	
	public static DbConn getInstance() {
		if(instance == null) {
			instance =new DbConn();
		}
		return instance;
	}
}
