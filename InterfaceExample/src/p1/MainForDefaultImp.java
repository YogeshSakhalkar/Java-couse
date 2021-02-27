package p1;

public class MainForDefaultImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DataConnection con = new DataImpt();
		//con.getNoSqlConnection();
		DataConnection con1 = new NoImpDB();
		con1.getNoSqlConnection();
	}

}
