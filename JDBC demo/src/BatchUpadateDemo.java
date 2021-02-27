import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpadateDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement  stmt =  null;

		try {
			
			Class.forName("com.sql.jdbc.Driver");
			
			String strUrl="jdbc:mysql://localhost:3307/test";
			con = DriverManager.getConnection(strUrl,"root","root");
			
			stmt = con.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
