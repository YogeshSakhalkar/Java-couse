package p1;

public interface DataConnection {

	void getConnection();
	default void getNoSqlConnection()
	{
		System.out.println("if the service provider does'nt hav implementation");
	}
}
