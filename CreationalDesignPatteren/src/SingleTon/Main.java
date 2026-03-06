package SingleTon;

public class Main {

	public static void main(String[] args) {
		System.out.println(DbConn.getInstance().hashCode());
		System.out.println(DbConn.getInstance().hashCode());
		System.out.println(DbConn.getInstance().hashCode());

	}

}
