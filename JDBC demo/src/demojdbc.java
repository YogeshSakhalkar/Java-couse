import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class demojdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Sucessfully");
			String url="jdbc:mysql://localhost:3307/test";
			Connection con=DriverManager.getConnection(url,"root","root");
			System.out.println("Connction Sucessfull");
			
			Statement stmt = con.createStatement();
			
			int id =99;
			String name="xyz";
			double sal=89000;
			
			String sql="insert into employee values("+id+" , '"+name+"',"+sal+")";
			stmt.executeUpdate(sql);
			System.out.println("1 row updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
