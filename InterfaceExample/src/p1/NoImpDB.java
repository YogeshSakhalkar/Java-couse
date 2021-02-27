package p1;

public class NoImpDB implements DataConnection{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("this is the implemention of NoimpDB");
	}

	public void getNoSqlConnection() {
		// TODO Auto-generated method stub
		System.out.println("this is under No DB implementation");
	}
}
